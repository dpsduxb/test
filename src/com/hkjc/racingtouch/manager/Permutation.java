package com.hkjc.racingtouch.manager;

public class Permutation {

	public static void combinationUtil(String arr[], String data[], int start, int end, int index, int r) {
		if (index == r) {
			for (int j = 0; j < r; j++)
				System.out.print(data[j] + " ");
			
			System.out.println("");
			return;
		}

		for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
			data[index] = arr[i];
			combinationUtil(arr, data, i + 1, end, index + 1, r);
		}
	}

	public static void printCombination(String arr[], int n, int r) {
		String data[] = new String[r];

		combinationUtil(arr, data, 0, n - 1, 0, r);
	}

	public static void main(String[] args) {
		String arr[] = { "LastSixRecords", "Draw", "Ability", "Condition", "JockeyCode", "RunningStyleAll", "IdealDistance", "DistanceTotalRuns",
				 "DistanceTotalRuns", "DistanceFirst", "DistanceSecond", "DistanceThird"};
		int r = 3;
		int n = arr.length;
		printCombination(arr, n, r);
	}
}