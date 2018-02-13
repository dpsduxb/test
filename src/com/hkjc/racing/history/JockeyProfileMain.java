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

public class JockeyProfileMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		loadURL("http://ibutinfo01.hkjc.com/infoA/IBUA/HR_GetInfo.ashx?QT=HR_JOCKEY_PROFILE");
	}

	private static void loadURL(String url) throws IOException{
		Document doc = Jsoup.connect(url).get();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Elements jockeys = doc.select("Jockey");
		if( jockeys != null ){
			parseJockeyData( jockeys);
		}else{
			System.out.println("No Jockeys");
		}
	}
	
	private static void parseJockeyData(Elements jockeys){
		for (Element jockey : jockeys) {
			Jockey jockey2 = new Jockey();
			
			jockey2.setJockeyCode(jockey.attr("Code"));
			jockey2.setNameE(jockey.attr("NameE"));
			
			Element seasonStat = jockey.child(1);
			jockey2.setRank(seasonStat.attr("Rank"));
			jockey2.setFirst(seasonStat.attr("First"));
			jockey2.setSecond(seasonStat.attr("Second"));
			jockey2.setThird(seasonStat.attr("Third"));
			jockey2.setTotalRuns(seasonStat.attr("TotalRuns"));
			jockey2.setWin(seasonStat.attr("WIN"));
			jockey2.setPlace(seasonStat.attr("PLACE"));
			
			new RacingService().saveJockey(jockey2);
		}
		
	}
}