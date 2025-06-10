/**
 * 
 */
package com.prefixsum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Piyush Soni
 *
 */
public class RangeSumQueries {

	static int[] prefixSum;

	private static void populatePrefixSum(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i];
		}

		prefixSum = arr;
	}

	private static int getRangeSumQuery(int left, int right) {
		if (left == 0) {
			return prefixSum[right];
		}

		return prefixSum[right] - prefixSum[left - 1];
	}

	public static void main(String[] args) {
		int arr[] = { 3, 7, 2, 5, 5 };
		//populatePrefixSum(arr);
		//int result = getRangeSumQuery(4, 4);
		//System.out.println(result);
		int count = countSubArraySum(arr, 10);
		System.out.println(count);

	}

	private static int countSubArraySum(int arr[], int k) {
		int prefixSum = 0;
		int count = 0;
		Map<Integer, Integer> prefixSumArrayCounts = new HashMap<Integer, Integer>();
		prefixSumArrayCounts.put(0, 1);
		
		for(int i : arr) {
			prefixSum += i;
			
			if(prefixSumArrayCounts.containsKey(prefixSum - k)) {
				count+=prefixSumArrayCounts.get(prefixSum - k);
			}
			
			prefixSumArrayCounts.put(prefixSum, prefixSumArrayCounts.getOrDefault(prefixSum, 0) + 1);
		}
		
		
		return count;
	}
}
