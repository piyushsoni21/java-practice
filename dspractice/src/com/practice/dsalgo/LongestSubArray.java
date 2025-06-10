/**
 * 
 */
package com.dsalgo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Piyush Soni
 *
 */

public class LongestSubArray {
	public static void main(String[] args) {
		//int arr[] = { 1, 2, 3, 1, 1, 0, 1, 2, 3 };
		int arr [] = {2,0,0,3};
		// calculateSubArray(arr, 3);
		//
		//optimalCalculation(arr, 3);
		
		Map<Integer,Integer > linkedHashMap = new HashMap<>();
		linkedHashMap.put(1, 100);
		linkedHashMap.put(10, 100);
		linkedHashMap.put(5, 100);
		for(int i : linkedHashMap.keySet()) {
			System.out.println(i);
		}
		
		
	}

	// o(n^2)
	private static void calculateSubArray(int arr[], int k) {
		int longestLength = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				if (sum == k) {
					longestLength = Math.max(longestLength, j - i + 1);
				}
			}
		}
		System.out.println(longestLength);
	}

	// int arr[] = { 1, 2, 3, 1, 1, 0, 1, 2, 3 };
	private static void optimalCalculation(int arr[], int k) {
		Map<Integer, Integer> prefixSum = new HashMap<>();
		int longestLength = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(!prefixSum.containsKey(sum)) {
				prefixSum.put(sum, i );
			}
			if (sum == k) {
				longestLength = Math.max(longestLength, i+1);
			} else {
				int prevSum = sum - k;
				if (prefixSum.containsKey(prevSum)) {
					longestLength = Math.max(longestLength, i - prefixSum.get(prevSum));

				}
			}
		}
		System.out.println(longestLength);
	}
}
