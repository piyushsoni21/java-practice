/**
 * 
 */
package com.prefixsum;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Piyush Soni
 *
 */
public class TripletSum {

	static boolean find3Numbers(int[] arr, int sum) {
		int n = arr.length;

		// Fix the first element as arr[i]
		for (int i = 0; i < n - 2; i++) {

			// Create a set to store potential second
			// elements that complement the desired sum
			Set<Integer> s = new HashSet<>();

			// Calculate the current sum needed to reach the
			// target sum
			int curr_sum = sum - arr[i];

			// Iterate through the subarray arr[i+1..n-1] to
			// find a pair with the required sum
			for (int j = i + 1; j < n; j++) {

				// Calculate the required value for the
				// second element
				int required_value = curr_sum - arr[j];

				// Check if the required value is present in
				// the set
				if (s.contains(required_value)) {

					// Triplet is found; print the triplet
					// elements
					System.out.println("Triplet is " + arr[i] + ", " + arr[j] + ", " + required_value);
					return true;
				}

				// Add the current element to the set for
				// future complement checks
				s.add(arr[j]);
			}
		}

		// If no triplet is found, return false
		return false;
	}

	// Driver program to test above function
	public static void main(String[] args) {
		int[] arr = { 1, 4, 45, 6, 10, 8 };
		int sum = 22;

		find3Numbers(arr, sum);
	}
}
