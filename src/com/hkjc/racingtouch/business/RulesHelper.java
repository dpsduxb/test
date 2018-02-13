package com.hkjc.racingtouch.business;

import java.util.ArrayList;
import java.util.List;

public class RulesHelper {

	public List<Integer> getLastSix(String lastSixRecords){
		List<Integer> records = new ArrayList<Integer>();

		if(notNullOrEmpty(lastSixRecords)){
			String[] lastSixRecs = lastSixRecords.split("/");
			for (int i = 0; i < lastSixRecs.length; i++) {
				if(notNullOrEmpty(lastSixRecs[i])){
					try{
						records.add(Integer.parseInt(lastSixRecs[i]));
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}
		
		return records;
	}
	
	public boolean isDebut(String lastSixRecords){
		List<Integer> lastSix = getLastSix( lastSixRecords );
		if(lastSix == null || lastSix.size() == 0){
			return true;
		}
		
		return false;
	}
	
	private boolean notNullOrEmpty(String text){
		if(text != null && !text.isEmpty()){
			return true;
		}
		
		return false;
	}
}
