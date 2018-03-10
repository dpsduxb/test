package com.hkjc.racingtouch.model;

public class RacePointsModel implements Comparable<RacePointsModel> {

	private double ability;
	private double condition;
	private double distance;
	private double draw;
	private double form;
	private double rank;
	private double runningStyle;

	@Override
	public String toString() {
		return "RacePointsModel [ability=" + ability + ", condition=" + condition + ", distance=" + distance + ", draw="
				+ draw + ", form=" + form + ", rank=" + rank + ", runningStyle=" + runningStyle + " , TotalPoints="
				+ getTotalPoints() + "]";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ability);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(condition);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(distance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(draw);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(form);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rank);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(runningStyle);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RacePointsModel other = (RacePointsModel) obj;
		if (Double.doubleToLongBits(ability) != Double.doubleToLongBits(other.ability))
			return false;
		if (Double.doubleToLongBits(condition) != Double.doubleToLongBits(other.condition))
			return false;
		if (Double.doubleToLongBits(distance) != Double.doubleToLongBits(other.distance))
			return false;
		if (Double.doubleToLongBits(draw) != Double.doubleToLongBits(other.draw))
			return false;
		if (Double.doubleToLongBits(form) != Double.doubleToLongBits(other.form))
			return false;
		if (Double.doubleToLongBits(rank) != Double.doubleToLongBits(other.rank))
			return false;
		if (Double.doubleToLongBits(runningStyle) != Double.doubleToLongBits(other.runningStyle))
			return false;
		return true;
	}

	public double getAbility() {
		return ability;
	}

	public void setAbility( double ability) {
		this.ability = ability;
	}

	public double getCondition() {
		return condition;
	}

	public void setCondition( double condition) {
		this.condition = condition;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance( double distance) {
		this.distance = distance;
	}

	public double getDraw() {
		return draw;
	}

	public void setDraw( double draw) {
		this.draw = draw;
	}

	public double getForm() {
		return form;
	}

	public void setForm( double form) {
		this.form = form;
	}

	public double getRank() {
		return rank;
	}

	public void setRank( double rank) {
		this.rank = rank;
	}

	public double getRunningStyle() {
		return runningStyle;
	}

	public void setRunningStyle( double runningStyle) {
		this.runningStyle = runningStyle;
	}

	public double getTotalPoints() {
		return ability + condition + distance + draw + form + rank + runningStyle;
	}

	public int compareTo(RacePointsModel o) {
		double totalPoints1 = this.getTotalPoints();
		double totalPoints2 = o.getTotalPoints();
		
		if (totalPoints2 > totalPoints1) {
			return 1;
		} else if (totalPoints2 < totalPoints1) {
			return -1;
		}
		return 0;
	}
}
