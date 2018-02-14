package com.hkjc.racing.history;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.hkjc.racing.model.RaceCard;
import com.hkjc.racing.sql.RacingService;

public class RaceDayDataMain {

	/**
	 * @param args
	 * @throws Exception 
	 */
	private static String DOMAIN_URL = "http://racing.hkjc.com";
	private static String BASE_URL = "http://racing.hkjc.com/racing/Info/meeting/RaceCard/english/";
	
	public static void main(String[] args) throws Exception {
		loadRacesData(BASE_URL);
	}

	private static void loadRacesData(String url) throws Exception{
		RacingService racingService = new RacingService();
		
		List<String> raceNos = getRaceNos(url);
		
		for (String raceNoURL : raceNos) {
			String[] raceDetails = raceNoURL.split("/");
			List<List<String>> raceRecords = loadURL(DOMAIN_URL + raceNoURL);
			if( raceRecords != null){
				for (List<String> raceRecord : raceRecords) {
					RaceCard race = createRaceCard(raceRecord, raceDetails[raceDetails.length-3], 
							raceDetails[raceDetails.length-1], raceDetails[raceDetails.length-2]);
					if( race != null ){
						racingService.saveRaceCard( race );
						System.out.println(race);
					}else{
						System.out.println("Error");
					}
				}
			}else{
				System.out.println("Error");
			}
		}
	}
	
	private static List<String> getRaceNos(String url) throws Exception{
		Document doc = Jsoup.connect(url).get();
		
		Elements raceNums = doc.select(".raceNum tr td a");
		List<String> eachAttr = raceNums.eachAttr("href");
		if(eachAttr != null && eachAttr.size() > 0){
			eachAttr.add(0, eachAttr.get(0).substring(0, eachAttr.get(0).length()-1)+"1");
		}
		return eachAttr;
	}
	
	private static Map<String, String> raceDetails = null;
	
	private static List<List<String>> loadURL(String url) throws IOException{
		Document doc = Jsoup.connect(url).get();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Element resultsTable = doc.select("#racecard td table").eq(1).first();
		
		Element raceDetailsTable = doc.select("#racecard .rowDivLeft table").eq(0).first();
		raceDetails = parseRaceDetails(raceDetailsTable);
		
		if( resultsTable != null ){
			return parseRacingData( resultsTable);
		}else{
			return null;
		}
	}
	
	private static Map<String, String> parseRaceDetails(Element raceDetail){
		String details = raceDetail.select("tbody tr td").text();
		String[] raceList = details.split(",");
		
		Map<String, String> raceDetails = new HashMap<String, String>();
		
		try{
			raceDetails.put("raceName", raceList[0]);
			raceDetails.put("raceTrack", raceList[4]);
			raceDetails.put("raceCourseType", raceList[5]);
			raceDetails.put("raceDistance", raceList[6]);
			raceDetails.put("raceRating", raceList[9]);
			raceDetails.put("raceClass", raceList[10]);
		}catch(Exception e){
			System.out.println(raceList);
			e.printStackTrace();
		}
		
		return raceDetails;
	}
	private static List<List<String>> parseRacingData(Element raceData){
		Elements rows = raceData.select("tbody tr");
		List<List<String>> raceRecords = new ArrayList<List<String>>();
		for (Element row : rows) {
			List<String> eachText = row.getElementsByTag("td").eachText();
			if(eachText.size() > 6){
				raceRecords.add(eachText);
			}
		}
		if(raceRecords != null && raceRecords.size() > 0){
			raceRecords.remove(0);
		}
		return raceRecords;
	}
	
	private static RaceCard createRaceCard(List<String> raceValues, String raceDate, String raceNo, String location){
		System.out.println(raceValues);
		
		RaceCard race = new RaceCard();
		
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			java.util.Date raceDateObj = new java.util.Date();
			try {
				raceDateObj = dateFormat.parse(raceDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			race.setRaceName(raceDetails.get("raceName"));
			race.setRaceTrack(raceDetails.get("raceTrack"));
			race.setRaceCourseType(raceDetails.get("raceCourseType"));
			race.setRaceDistance(raceDetails.get("raceDistance"));
			race.setRaceRating(raceDetails.get("raceRating"));
			race.setRaceClass(raceDetails.get("raceClass"));
			
			race.setRaceDate(raceDateObj);
			race.setRaceNo(Integer.parseInt(raceNo));
			race.setRaceLoc(location);
			race.setHorseNo(Integer.parseInt(raceValues.get(0)));
			race.setPreviousRuns(raceValues.get(1));
			race.setColour(raceValues.get(2));
			race.setHorse(raceValues.get(2));
			race.setBrandNo(raceValues.get(3));
			race.setWeight(Integer.parseInt(raceValues.get(4)));
			race.setJockey(raceValues.get(5));
			//race.setOverWt(Integer.parseInt(raceValues.get(6)));
			race.setDraw(Integer.parseInt(raceValues.get(7)));
			race.setTrainer(raceValues.get(8));
			race.setRating(Integer.parseInt(raceValues.get(9)));
			race.setRatingIncDec(Integer.parseInt(raceValues.get(10).replace("-", "0")));
			race.setDecHorseWeight(Integer.parseInt(raceValues.get(11)));
			if(raceValues.get(12).isEmpty() || raceValues.get(12).contains("-")){
				race.setDecHorseWeightInc(0);
			}else{
				race.setDecHorseWeightInc(Integer.parseInt(raceValues.get(12)));
			}
			race.setBestTime(raceValues.get(13));
			race.setAge(Integer.parseInt(raceValues.get(14)));// Age, WFA, Sex, Season Stakes, Priority, Gear
			race.setwFA(raceValues.get(15));
			race.setSex(raceValues.get(16));
			race.setSeasonStakes(raceValues.get(17));
			
			if(raceValues.get(18).isEmpty() || raceValues.get(18).contains("-")){
				race.setPriority(0);
			}else{
				race.setPriority(Integer.parseInt(raceValues.get(18).substring(raceValues.get(18).length()-1, raceValues.get(18).length())));
			}
			race.setGear(raceValues.get(19).length() > 19 ? raceValues.get(19).substring(0,19):raceValues.get(19));
	        
	        
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return race;
	}
}
