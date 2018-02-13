package com.hkjc.racing.history;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.hkjc.racing.sql.ConnectMSSQLServer;
import com.hkjc.racingtouch.manager.RaceXMLParser;

public class RacingTouchMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		loadURL("http://ibutinfo01.hkjc.com/infoA/IBUA/HR_GetInfo.ashx?QT=HR_HORSE_PROFILE");
	}

	private static List<List<String>> loadURL(String url) throws IOException{
		Document doc = Jsoup.connect(url).get();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Elements races = doc.select("Race");
		Element meeting = doc.select("Meeting").first();
		if( races != null ){
			return parseRacingData( races, meeting );
		}else{
			System.out.println("No races");
			return null;
		}
	}
	
	private static List<List<String>> parseRacingData(Elements races, Element meeting){
		//Elements rows = races.select("tbody tr");
		List<List<String>> raceRecords = new ArrayList<List<String>>();
		for (Element race : races) {
			RaceXMLParser xmlParser = new RaceXMLParser();
			xmlParser.parseRaceXML(race);
			xmlParser.parseRaceMeetingXML(meeting);
			for (Element raceHorse : race.select("Starter")) {
				xmlParser.parseRaceStarterXML(raceHorse);
				new ConnectMSSQLServer().insertHorseInfoData(xmlParser);
			}
		}
		return raceRecords;
	}
}