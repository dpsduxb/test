package com.hkjc.racing.history;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.hkjc.racing.sql.RacingService;
import com.hkjc.racingtouch.manager.RaceXMLParser;
import com.hkjc.racingtouch.model.Jockey;
import com.hkjc.racingtouch.model.RaceResult;

public class RaceResultsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		loadURL("http://ibutinfo01.hkjc.com/infoA/IBUA/HR_GetInfo.ashx?QT=HR_RESULTS&Lang=en-US");
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
			
			for (Element result : resultInfo.select("Result")) {
				raceResult.setPosition(Integer.parseInt(result.attr("Position")));
				raceResult.setHorseName(result.attr("HorseName"));
				raceResult.setJockeyName(result.attr("JockeyName"));
				raceResult.setHorseNo(result.attr("StarterNumber"));
				
			
				new RacingService().saveRaceResults(raceResult);
			}
		}
		
	}
}