package com.hkjc.racingtouch.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		//printCombination(arr, n, r);
		
		String a[] = arr;
		
		final int maxbit = 1 << a.length;

        //for each combination given by a (binary) number 'p'...
        for (int p = 0; p < maxbit; p++) {
            final List<String> res = new ArrayList<String>();

            //evaluate if array 'a' element at index 'i' is present in combination (and include it if so)
            for (int i = 0; i < a.length; i++) {
                if ((1 << i & p) > 0) {
                    res.add(a[i]);
                }
            }
            System.out.println(Arrays.toString(res.toArray()));
        }
        
	}
}