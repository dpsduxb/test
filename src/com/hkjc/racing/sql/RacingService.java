package com.hkjc.racing.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hkjc.racingtouch.business.RaceDayAnalysis;
import com.hkjc.racingtouch.manager.RaceXMLParser;
import com.hkjc.racingtouch.model.Dividend;
import com.hkjc.racingtouch.model.HorseEntity;
import com.hkjc.racingtouch.model.Jockey;
import com.hkjc.racingtouch.model.JockeyEntity;
import com.hkjc.racingtouch.model.RacePointsModel;
import com.hkjc.racingtouch.model.RaceResult;
import com.hkjc.racingtouch.utils.SQLUtil;

public class RacingService {

	public void saveJockey(Jockey jockey) {
		try {
			Connection conn = new SQLUtil().getConnection();

			String queryString = "INSERT INTO [HKJC].[dbo].Jockey "
					+ "VALUES (?,?,?,?,?,?,?,?,?)";

			PreparedStatement statement = conn.prepareStatement(queryString);
			statement.setString(1, jockey.getJockeyCode());
			statement.setString(2, jockey.getNameE());
			statement.setString(3, jockey.getRank());
			statement.setString(4, jockey.getFirst());
			statement.setString(5, jockey.getSecond());
			statement.setString(6, jockey.getThird());
			statement.setString(7, jockey.getTotalRuns());
			statement.setString(8, jockey.getWin());
			statement.setString(9, jockey.getPlace());

			statement.executeUpdate();

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveHorseInfo(RaceXMLParser race) {
		try {
			Connection conn = new SQLUtil().getConnection();

			String queryString = "INSERT INTO [HKJC].[dbo].RaceHorse "
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement statement = conn.prepareStatement(queryString);
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			java.util.Date meetingDate = dateFormat.parse(race.mMeeting
					.getDate());

			statement.setDate(1, new java.sql.Date(meetingDate.getTime()));
			statement.setString(2, race.mMeeting.getVenue());
			statement.setInt(3, race.mRace.getRaceNo());
			statement.setInt(4, race.mRace.getDistance());
			statement.setString(5, race.mComment.getLongTextE());
			statement.setString(6, race.mHorseInfo.getLastSixRecords());
			statement.setString(7, race.mHorseInfo.getLastSixRecords());
			statement.setString(8, race.mHorseInfo.getDraw());
			statement.setString(9, race.mHorseInfo.getAbility());
			statement.setString(10, race.mHorseInfo.getCondition());
			statement.setString(11, race.mHorseInfo.getClassChange());
			statement.setString(12, race.mHorseInfo.getRunningStyleAll());
			statement.setString(13, race.mHorseInfo.getAge());
			statement.setInt(14, race.mHorseInfo.getHorseWeight());
			statement.setInt(15, race.mHorseInfo.getLastHorseWeight());
			statement.setString(16, race.mHorseInfo.getBodyWeight());
			statement.setString(17, race.mHorse.getHorseCode());
			statement.setString(18, race.mHorseInfo.getJockeyCode());
			statement.setString(19, race.mHorseInfo.getTrainerCode());
			statement.setString(20, race.mHorseInfo.getWeightCarried());
			statement.setString(21, race.mHorseInfo.getIdealDistance());
			statement.setString(22, race.mDistanceStat.getTotalRuns());
			statement.setString(23, race.mDistanceStat.getFirst());
			statement.setString(24, race.mDistanceStat.getSecond());
			statement.setString(25, race.mDistanceStat.getThird());
			statement.setString(26, race.mStat.getTotalRuns());
			statement.setString(27, race.mStat.getFirst());
			statement.setString(28, race.mStat.getSecond());
			statement.setString(29, race.mStat.getThird());
			statement.setInt(30, race.mStarter.getNumber());
			statement.executeUpdate();

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveRaceResults(RaceResult race) {
		try {
			Connection conn = new SQLUtil().getConnection();
			String queryString = "INSERT INTO [HKJC].[dbo].RaceResult "
					+ "VALUES (?,?,?,?,?,?,?,?)";

			PreparedStatement statement = conn.prepareStatement(queryString);

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			java.util.Date meetingDate = dateFormat
					.parse(race.getMeetingDate());

			statement.setDate(1, new java.sql.Date(meetingDate.getTime()));
			statement.setString(2, race.getMeetingVenue());
			statement.setInt(3, race.getRaceNo());
			statement.setInt(4, race.getPosition());
			statement.setString(5, race.getHorseNo());
			statement.setString(6, race.getHorseName());
			statement.setString(7, race.getJockeyName());
			statement.setFloat(8, race.getWinOdds());

			statement.executeUpdate();

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveRaceDayPoints(RacePointsModel race) {
		try {
			Connection conn = new SQLUtil().getConnection();
			String queryString = "INSERT INTO [HKJC].[dbo].RaceDayPoints "
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement statement = conn.prepareStatement(queryString);

			statement.setString(1, race.getMeetingDate());
			statement.setString(2, race.getMeetingVenue());
			statement.setString(3, race.getRaceNo());
			statement.setString(4, race.getHorseNo());
			statement.setDouble(5, race.getAbility());
			statement.setDouble(6, race.getCondition());
			statement.setDouble(7, race.getDistance());
			statement.setDouble(8, race.getDraw());
			statement.setDouble(9, race.getForm());
			statement.setDouble(10, race.getRank());
			statement.setDouble(11, race.getRunningStyle());
			statement.setDouble(12, race.getTotalPoints());
			
			statement.executeUpdate();

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveDividends(Dividend dividend) {
		try {
			Connection conn = new SQLUtil().getConnection();
			String queryString = "INSERT INTO [HKJC].[dbo].Dividend "
					+ "VALUES (?,?,?,?,?,?)";

			PreparedStatement statement = conn.prepareStatement(queryString);
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

			statement.setDate(
					1,
					new java.sql.Date(dateFormat.parse(
							dividend.getMeetingDate()).getTime()));
			statement.setString(2, dividend.getMeetingVenue());
			statement.setInt(3, dividend.getRaceNo());
			statement.setString(4, dividend.getPoolText());
			statement.setString(5, dividend.getWinCombination());
			statement.setFloat(6, dividend.getDividendAmount());

			statement.executeUpdate();

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<HorseEntity> getRaces() {
		List<HorseEntity> races = new ArrayList<HorseEntity>();

		try {
			Connection conn = new SQLUtil().getConnection();
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

			String queryString = "SELECT * FROM [HKJC].[dbo].RaceHorse rh LEFT OUTER JOIN [HKJC].[dbo].Jockey j ON rh.JockeyCode= j.JockeyCode" +
					" WHERE MeetingDate = '" + dateFormat.format(new Date()) + "'";

			PreparedStatement statement = conn.prepareStatement(queryString);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				HorseEntity horse = new HorseEntity();

				horse.setAbility(rs.getString("Ability"));
				horse.setCondition(rs.getString("Condition"));
				horse.setDistance(rs.getString("Distance"));
				horse.setDraw(rs.getString("Draw"));
				horse.setIdealDistance(rs.getString("IdealDistance"));
				horse.setLastSixRecords(rs.getString("LastSixRecords"));
				horse.setLastSixRunTxt(rs.getString("LastSixRunTxt"));
				horse.setRunningStyleAll(rs.getString("RunningStyleAll"));
				horse.setRaceNo(rs.getString("RaceNo"));
				horse.setMeetingDate(rs.getString("MeetingDate"));
				horse.setComment(rs.getString("Comment"));
				horse.setMeetingDate(rs.getString("MeetingDate"));
				horse.setMeetingVenue(rs.getString("MeetingVenue"));
				horse.setHorseNo(rs.getString("HorseNo"));
				
				JockeyEntity jockeyEntity = new JockeyEntity();
				jockeyEntity.setJockeyCode(rs.getString("JockeyCode"));
				jockeyEntity.setNameE(rs.getString("NameE"));
				jockeyEntity.setRank(rs.getString("Rank"));
				
				horse.setJockey(jockeyEntity);
				
				races.add(horse);
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return races;
	}

	public static void main(String[] args) {

	}

}