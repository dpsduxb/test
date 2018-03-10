package com.hkjc.racingtouch.business;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import com.hkjc.racingtouch.model.HorseEntity;
import com.hkjc.racingtouch.model.RacePointsModel;

public class RaceDayAnalysis {

	public static void main(String[] args) {
		List<HorseEntity> races = new RaceRestService().getRaceDayData();
		TreeSet<RacePointsModel> racePoints = new TreeSet<RacePointsModel>();
		
		for (Iterator<HorseEntity> iterator = races.iterator(); iterator.hasNext();) {
			HorseEntity horseEntity = (HorseEntity) iterator.next();
			
			racePoints.add(getRacePoints(horseEntity));
		}
		System.out.println("Size: " + racePoints.size());
		System.out.println(racePoints);
	}
	
	private static RacePointsModel getRacePoints(HorseEntity horseEntity){
		
		RacePointsModel racePointsModel = new RacePointsModel();
		racePointsModel.setAbility(new Rules().AbilityRule(horseEntity.getAbility()));
		racePointsModel.setCondition(new Rules().CoditionRule(horseEntity.getCondition()));
		racePointsModel.setDistance(new Rules().distanceRule(horseEntity.getDistance(), horseEntity.getIdealDistance()));
		racePointsModel.setDraw(new Rules().drawRule(horseEntity.getDraw()));
		racePointsModel.setForm(new Rules().formRule(new RulesHelper().getLastSix(horseEntity.getLastSixRecords())));
		//new Rules().RankRule(horseEntity.getra());
		racePointsModel.setRunningStyle(new Rules().RunningStyleRule(horseEntity.getRunningStyleAll()));
		
		return racePointsModel;
	}

}
