package com.hkjc.racingtouch.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.hkjc.racingtouch.utils.SQLUtil;

public class AnalysisManager {

	public List<Map<String, Object>> getRecordsByGroup(String groupByCols){
		String queryString = "SELECT " + groupByCols + ", COUNT(*) as total FROM [HKJC].[dbo].RaceHorse GROUP BY " 
								+ groupByCols + " ORDER BY total desc";;
		
		return executeQuery(queryString, groupByCols);
	}
	
	public List<Map<String, Object>> getResultRecords( ){
		String rankColumn = "";
		rankColumn = " INNER JOIN [HKJC].[dbo].Jockey j ON j.JockeyCode = rh.JockeyCode"; 
		
		String queryString = "SELECT * FROM [HKJC].[dbo].RaceHorse rh " + rankColumn + " LEFT OUTER JOIN [HKJC].[dbo].RaceResult rr "
				+ "ON rh.MeetingDate = rr.MeetingDate AND rh.RaceNo = rr.RaceNo AND rh.HorseNo = rr.HorseNo";
		
		return executeQuery(queryString, "");
	}
	
	public List<Map<String, Object>> getResultRecordsByGroup(String groupByCols ){
		String rankColumn = "";
		if(groupByCols.contains("Rank")) {
			rankColumn = " INNER JOIN [HKJC].[dbo].Jockey j ON j.JockeyCode = rh.JockeyCode"; 
		}
		String queryString = "SELECT " + groupByCols.toString() + ", COUNT(position) as winTotal, COUNT(*) as total, (COUNT(position)*100/COUNT(*)) as perc "
				+ "FROM [HKJC].[dbo].RaceHorse rh " + rankColumn + " LEFT OUTER JOIN [HKJC].[dbo].RaceResult rr "
				+ "ON rh.MeetingDate = rr.MeetingDate AND rh.RaceNo = rr.RaceNo AND rh.HorseNo = rr.HorseNo GROUP BY " 
				+ groupByCols.toString() + " ORDER BY perc desc";
		
		return executeQuery(queryString, groupByCols);
	}
	
	public List<Map<String, Object>> getResultDividendsByGroup(String groupByCols){
		String queryString = "SELECT " + groupByCols.toString() + ", COUNT(position) as winTotal, COUNT(*) as total "
				+ "FROM [HKJC].[dbo].RaceHorse rh LEFT OUTER JOIN [HKJC].[dbo].RaceResult rr "
				+ "ON rh.MeetingDate = rr.MeetingDate "
				+ "AND rh.RaceNo = rr.RaceNo INNER JOIN [HKJC].[dbo].Dividend d ON rh.MeetingDate = d.MeetingDate AND rh.RaceNo = d.RaceNo GROUP BY " 
				+ groupByCols.toString() + " ORDER BY total desc";
		
		return executeQuery(queryString, groupByCols);
	}
	
	private List<Map<String, Object>> executeQuery(String sqlQuery, String columns){
		Connection conn = new SQLUtil().getConnection();
		System.out.println("SQL Query: " + sqlQuery);

		try {
			ResultSet resultSet = conn.createStatement().executeQuery( sqlQuery );
			
			List<Map<String, Object>> resultSet2 = new SQLUtil().parseResultSet(resultSet);
			
			return resultSet2;
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
