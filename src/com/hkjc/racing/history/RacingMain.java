package com.hkjc.racing.history;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.hkjc.racing.model.Race;
import com.hkjc.racing.sql.RacingService;

public class RacingMain {

	/**
	 * @param args
	 * @throws Exception 
	 */
	private static String DOMAIN_URL = "http://racing.hkjc.com";
	private static String BASE_URL = "http://racing.hkjc.com/racing/info/meeting/Results/english/";
	
	public static void main(String[] args) throws Exception {
		loadRacesData(BASE_URL, true);
	}

	/*private static void loadURL()throws Exception {
		URL uri = new URL("http://racing.hkjc.com/racing/info/meeting/Results/english/Local/20171206/");
		
		URLConnection ec = uri.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(
				ec.getInputStream(), "UTF-8"));
		String inputLine;
		StringBuilder a = new StringBuilder();
		while ((inputLine = in.readLine()) != null)
			a.append(inputLine);
		
		in.close();
		
		System.out.println(a.toString());
		
	}*/
	
	private static void loadRacesData(String url, boolean isToday) throws Exception{
		List<String> raceDates = getRaceDates(url);
		RacingService racingService = new RacingService();
		for (String raceDateUrl : raceDates) {
			List<String> raceNos = getRaceNos(raceDateUrl);
			
			for (String raceNoURL : raceNos) {
				String[] raceDetails = raceNoURL.split("/");
				List<List<String>> raceRecords = loadURL(DOMAIN_URL + raceNoURL);
				if( raceRecords != null){
					for (List<String> raceRecord : raceRecords) {
						Race race = createRace(raceRecord, raceDetails[raceDetails.length-3], 
								raceDetails[raceDetails.length-1], raceDetails[raceDetails.length-2]);
						if( race != null ){
							racingService.saveRace( race );
						}else{
							System.out.println("Error");
						}
					}
				}else{
					System.out.println("Error");
				}
				
				/*CompositeOdd compositeOdd = loadCompositeURL(DOMAIN_URL + raceNoURL);
				if( compositeOdd != null){
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
					java.util.Date raceDateObj = new java.util.Date();
					try {
						raceDateObj = dateFormat.parse( raceDetails[raceDetails.length-3] );
					} catch (ParseException e) {
						e.printStackTrace();
					}
					
					compositeOdd.setRaceDate( raceDateObj ); 
					compositeOdd.setRaceNo(	Integer.parseInt( raceDetails[raceDetails.length-1] ) );
					System.out.println(compositeOdd);
					mssqlServer.insertCompositeOdds(compositeOdd);
				}else{
					System.out.println("Error");
				}*/
			}
			if( isToday ){
				break;
			}
		}
	}
	
	private static List<String> getRaceDates(String url) throws Exception{
		Document doc = Jsoup.connect(url).get();
		
		Elements raceDates = doc.select("#raceDateSelect option");
		List<String> raceURLs = raceDates.eachAttr("value");
		
		return raceURLs;
	}
	
	private static List<String> getRaceNos(String url) throws Exception{
		Document doc = Jsoup.connect(BASE_URL + url).get();
		
		Elements raceNums = doc.select(".raceNum tr td a");
		List<String> eachAttr = raceNums.eachAttr("href");
		if(eachAttr != null && eachAttr.size() > 0){
			eachAttr.add(0, eachAttr.get(0).substring(0, eachAttr.get(0).length()-1)+"1");
			eachAttr.remove(eachAttr.size()-1);
		}
		return eachAttr;
	}
	
	private static List<List<String>> loadURL(String url) throws IOException{
		Document doc = Jsoup.connect(url).get();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Element resultsTable = doc.select("#results .clearDivFloat table").eq(2).first();
		//Element dividentTable = doc.select("#results .rowDivLeft table").eq(1).first();	
		
		/*if( dividentTable != null ){
			parseCompositeWin( dividentTable );
		}*/
		if( resultsTable != null ){
			return parseRacingData( resultsTable );
		}else{
			return null;
		}
	}
	
	/*private static CompositeOdd loadCompositeURL(String url) throws IOException{
		Document doc = Jsoup.connect(url).get();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Element dividentTable = doc.select("#results .rowDivLeft table").eq(1).first();	
		
		if( dividentTable != null ){
			return parseCompositeWin( dividentTable );
		}
		else{
			return null;
		}
	}*/
	
	private static List<List<String>> parseRacingData(Element raceData){
		Elements rows = raceData.select("tbody tr");
		List<List<String>> raceRecords = new ArrayList<List<String>>();
		for (Element row : rows) {
			List<String> eachText = row.getElementsByTag("td").eachText();
			if(eachText.size() > 6){
				raceRecords.add(eachText);
			}
		}
		return raceRecords;
	}
	
	/*private static CompositeOdd parseCompositeWin(Element raceData){
		Element a1Row = raceData.getElementsMatchingOwnText("3 PICK 1").first().parent();
		String a1Value = a1Row.children().last().ownText();
		
		Element a2Row = a1Row.nextElementSibling();
		String a2Value = a2Row.children().last().ownText();
		
		Element a3Row = a2Row.nextElementSibling();
		String a3Value = a3Row.children().last().ownText();
		
		CompositeOdd compositeOdd = new CompositeOdd();
		compositeOdd.setA1Value(a1Value.equalsIgnoreCase("NOT WIN")?0.0f:new Float(a1Value));
		compositeOdd.setA2Value(a2Value.equalsIgnoreCase("NOT WIN")?0.0f:new Float(a2Value));
		compositeOdd.setA3Value(a3Value.equalsIgnoreCase("NOT WIN")?0.0f:new Float(a3Value));
		
		return compositeOdd;
	}*/
	
	private static Race createRace(List<String> raceValues, String raceDate, String raceNo, String location){
		System.out.println(raceValues);
		Race race = new Race();
		
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			java.util.Date raceDateObj = new java.util.Date();
			try {
				raceDateObj = dateFormat.parse(raceDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			race.setRaceDate(raceDateObj);
	        race.setRaceNo(Integer.parseInt(raceNo));
	        race.setLocation(location);
	        race.setHorsePlace(Integer.parseInt(raceValues.get(0)));
	        race.setHorseNo(Integer.parseInt(raceValues.get(1)));
	        race.setHorse(raceValues.get(2));
	        race.setJockey(raceValues.get(3));
	        race.setTrainer(raceValues.get(4));
	        race.setActualWeight(Integer.parseInt(raceValues.get(5)));
	        race.setDeclaredWeight(Integer.parseInt(raceValues.get(6)));
	        race.setDraw(Integer.parseInt(raceValues.get(7)));
	        race.setLBW(raceValues.get(8));
	        race.setRunningPosition(raceValues.get(9));
	        race.setFinishTime(new Time(123456789));
	        race.setWinOdds(new Float(raceValues.get(raceValues.size()-1)));
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return race;
	}
}