package com.hkjc.racing.history;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.hkjc.racingtouch.manager.AnalysisManager;
import com.hkjc.racingtouch.manager.Combinations;

public class AnalysisServiceMain {

	public static void main(String[] args) {
		List<List<String>> combinations = new Combinations().getCombinations();
		for (Iterator iterator = combinations.iterator(); iterator.hasNext();) {
			List<String> columns = (List<String>) iterator.next();
			if(columns != null && columns.size() > 0){
				AnalysisManager analysisManager = new AnalysisManager();
				String columnsStr = columns.toString().substring(1,columns.toString().length()-1);
				//String columnsStr = columns.toString().replaceAll("[", "").replaceAll("]", "");
				List<Map<String, Object>> recordsByGroup = analysisManager.getRecordsByGroup(columnsStr);
				
				List<Map<String, Object>> resultRecordsByGroup = analysisManager.getResultRecordsByGroup(columnsStr);
			}
		}
	}

}
