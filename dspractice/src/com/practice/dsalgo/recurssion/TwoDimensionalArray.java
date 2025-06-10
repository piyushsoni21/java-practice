/**
 * 
 */
package com.dsalgo.recurssion;

import java.util.Arrays;

/**
 * @author Piyush Soni
 *
 */
public class TwoDimensionalArray {

	
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		for(int i =0;i<arr.length;i++) {
			Arrays.fill(arr[i], -1);
		}
		
		for (int i = 0; i < arr.length; i++) {
		    System.out.println(Arrays.toString(arr[i]));
		}
	}
}
