package com.hkjc.racing.history;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.hkjc.racing.sql.RacingService;
import com.hkjc.racingtouch.model.Dividend;
import com.hkjc.racingtouch.model.RaceResult;

public class RaceResultsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		//loadURL("http://ibutinfo01.hkjc.com/infoA/IBUA/HR_GetInfo.ashx?QT=HR_RESULTS&Lang=en-US");
		loadURL("http://ibutinfo01.hkjc.com/infoA/IBUA/HR_GetInfo.ashx?QT=HR_LASTNRESULTS&Lang=en-US");
	}

	private static void loadURL(String url) throws IOException{
		Document doc = Jsoup.connect(url).get();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Elements results = doc.select("MeetingInfo");
		if( results != null ){
			parseRaceResultData( results );
		}else{
			System.out.println("No Jockeys");
		}
	}
	
	private static void parseRaceResultData(Elements meetingInfo){
		Element meetInfo = meetingInfo.first();
		
		for (Element resultInfo : meetInfo.select("ResultInfo")) {
			RaceResult raceResult = new RaceResult();
			
			raceResult.setMeetingDate(meetInfo.attr("Date"));
			raceResult.setMeetingVenue(meetingInfo.attr("Venue"));
			raceResult.setRaceNo(Integer.parseInt(resultInfo.attr("RaceNo")));
			
			Dividend dividend = new Dividend();
			
			dividend.setMeetingDate(meetInfo.attr("Date"));
			dividend.setMeetingVenue(meetingInfo.attr("Venue"));
			dividend.setRaceNo(Integer.parseInt(resultInfo.attr("RaceNo")));
			
			for (Element result : resultInfo.select("Result")) {
				raceResult.setPosition(Integer.parseInt(result.attr("Position")));
				raceResult.setHorseName(result.attr("HorseName"));
				raceResult.setJockeyName(result.attr("JockeyName"));
				raceResult.setHorseNo(result.attr("StarterNumber"));
				
				raceResult.setWinOdds(Float.parseFloat(result.select("Horse").attr("WinOdds")));
			
				new RacingService().saveRaceResults(raceResult);
			}
			
			for (Element result : resultInfo.select("Dividend Selection")) {
				if(result.attr("PoolText").equalsIgnoreCase("3 Pick 1")){
					for (Element group : resultInfo.select("Group")) {
						dividend.setPoolText(result.attr("PoolText"));
						dividend.setWinCombination(group.attr("Starters"));
						dividend.setDividendAmount(Float.parseFloat(group.attr("DividendAmount").equalsIgnoreCase("Not Win")?"0.0":group.attr("DividendAmount")));
						
						new RacingService().saveDividends(dividend);
					}
				}else{
					dividend.setPoolText(result.attr("PoolText"));
					dividend.setWinCombination(result.attr("WinCombination"));
					try {
						dividend.setDividendAmount(Float.parseFloat(result.attr("DividendAmount").equalsIgnoreCase("Not Win")?"0.0":result.attr("DividendAmount").replaceAll(",", "")));
					}catch(Exception e) {
						dividend.setDividendAmount(Float.parseFloat("0.0"));
					}
					
					new RacingService().saveDividends(dividend);
				}
			}
		}

		
	}
}