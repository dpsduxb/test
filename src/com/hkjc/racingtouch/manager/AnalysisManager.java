package com.hkjc.racingtouch.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.hkjc.racingtouch.utils.SQLUtil;

public class AnalysisManager {

	public List<Map<String, Object>> getRecordsByGroup(List<String> groupByCols){
		String queryString = "SELECT " + groupByCols.toString() + ", COUNT(*) as total FROM [HKJC].[dbo].RaceHorse GROUP BY " + groupByCols.toString() + " ORDER BY total desc";;
		
		return executeQuery(queryString, groupByCols);
	}
	
	public List<Map<String, Object>> getResultRecordsByGroup(List<String> groupByCols){
		String queryString = "SELECT " + groupByCols.toString() + ", COUNT(position) as winTotal, COUNT(*) as total, (winTotal/total)*10 as winPercentage FROM [HKJC].[dbo].RaceHorse rh LEFT OUTER JOIN RaceResult rr ON rh.MeetingDate = rr.MeetingDate "
				+ "AND rh.RaceNo = rr.RaceNo GROUP BY " + groupByCols.toString() + " ORDER BY total desc";
		
		return executeQuery(queryString, groupByCols);
	}
	
	public List<Map<String, Object>> getResultDividendsByGroup(List<String> groupByCols){
		String queryString = "SELECT " + groupByCols.toString() + ", COUNT(position) as winTotal, COUNT(*) as total, (winTotal/total)*10*dividendAmount as winPercentage FROM [HKJC].[dbo].RaceHorse rh LEFT OUTER JOIN RaceResult rr ON rh.MeetingDate = rr.MeetingDate "
				+ "AND rh.RaceNo = rr.RaceNo INNER JOIN Dividend d ON rh.MeetingDate = d.MeetingDate AND rh.RaceNo = d.RaceNo GROUP BY " + groupByCols.toString() + " ORDER BY total desc";
		
		return executeQuery(queryString, groupByCols);
	}
	
	private List<Map<String, Object>> executeQuery(String sqlQuery, List<String> columns){
		Connection conn = new SQLUtil().getConnection();
		System.out.println("SQL Query: " + sqlQuery);
		try {
			ResultSet resultSet = conn.createStatement().executeQuery( sqlQuery );
			
			List<Map<String, Object>> resultSet2 = new SQLUtil().parseResultSet(resultSet);
			System.out.println("Results: " + resultSet2);
			
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
