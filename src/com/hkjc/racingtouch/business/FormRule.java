package com.hkjc.racingtouch.business;

import java.util.Iterator;
import java.util.List;

public class FormRule{

	public Double getPoints(List<Integer> previousRuns) {
		
		double formPoints = 0.0;
		for (Iterator<Integer> iterator = previousRuns.iterator(); iterator.hasNext();) {
			Integer previousPos = iterator.next();
			
			formPoints += previousPos;
		}
		if(previousRuns.size() == 0){
			return 0.0;
		}
		return previousRuns.size()/formPoints;
		
		/*int firstAverage = 0;
		int secondAverage = 0;
		for(int i=0; i< previousRuns.size(); i++){
			if(i < previousRuns.size()/2){
				firstAverage = (firstAverage + previousRuns.get(i));
			}else{
				secondAverage = (secondAverage + previousRuns.get(i));
			}
		}
		
		firstAverage = firstAverage/(previousRuns.size()/2);
		secondAverage = secondAverage/previousRuns.size();
		
		if(firstAverage < secondAverage && firstAverage <= 4){
			formPoints += 1;
		}
		
		return formPoints;*/
	}

}
