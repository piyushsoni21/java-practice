/**
 * 
 */
package com.prefixsum;

/**
 * @author Piyush Soni
 *
 */
public class PrefixSumCalculation {
   
	
	private static int[] calculatePrefixSum(int [] arr) {
		int [] prefixSum = new int[arr.length];
		
		prefixSum[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			prefixSum[i] = prefixSum[i-1]+ arr[i];
		}
		
		// To reduce space complexity
		/*
		 * for (int i = 1; i < arr.length; i++) { arr[i] = arr[i - 1] + arr[i]; }
		 */
		 
		return arr;
	}
	
	public static void main(String[] args) {
		int arr [] = {3,7,2,5,8};
		System.out.println(calculatePrefixSum(arr).toString());
	}
}
