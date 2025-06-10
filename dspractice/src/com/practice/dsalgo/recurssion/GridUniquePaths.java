/**
 * 
 */
package com.dsalgo.recurssion;

import java.util.Arrays;

/**
 * @author Piyush Soni
 *
 */
public class GridUniquePaths {

	
	public static void main(String[] args) {
		
		
		
		 int rows = 4;
	        int cols = 3;
	        int[][] dp = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            Arrays.fill(dp[i], -1); // Fill each row with -1
	        }
		
		int uniquePaths = uniquePaths(dp,4,3);
		System.out.println(uniquePaths);
	}

	/**
	 * @param uniquePathsMatrix
	 * @param i
	 * @param j
	 * @return
	 */
	private static int uniquePaths(int[][] uniquePathsMatrix, int i, int j) {
		
		return traversePath(3,2,uniquePathsMatrix);
	}
	
	
	private static int traversePath(int row,int column,int[][] dp) {
		if(row == 0 & column ==0) {
			return 1;
		}
		
		if(row<0 || column <0) {
			return 0;
		}
		
		if(dp[row][column] !=-1) {
			return dp[row][column];
		}
		
		int up = traversePath(row -1, column,dp);
		int left = traversePath(row, column-1,dp);
		
		return dp[row][column] = up + left;
	}
}
