/**
 * 
 */
package com.dsalgo.recurssion;

import java.util.Arrays;

/** 
 * @author Piyush Soni
 *
 */

//Input: heights[] = [20, 30, 40, 20] 
public class FrogJump {

	
	public static void main(String[] args) {
		int heights  [] = {20,30,40,20};
		int size = heights.length;
		int  dp [] = new int [heights.length];
		Arrays.fill(dp, -1);
		int energy = calculateMinEnergy( size ,heights,dp);
		System.out.println(energy);
	}

	/**
	 * @param size
	 * @param heights
	 */
	private static int calculateMinEnergy(int size, int[] heights,int dp[]) {
		return fj(size -1, heights,dp);
	}

	/**
	 * @param index
	 * @param heights
	 * @param dp
	 * @return
	 */
	private static int fj(int index, int[] heights, int[] dp) {
		if(index == 0) return 0;
		if(dp[index] != -1) {
			return dp[index];
		}
		int left = fj(index -1,heights,dp) + Math.abs(heights[index] - heights[index-1]);
		int right = Integer.MAX_VALUE;
		if(index >1) {
			right = fj(index-2,heights, dp) +Math.abs(heights[index] - heights[index-2]);
		}
		return dp[index] = Math.min(left, right);
	}
}
