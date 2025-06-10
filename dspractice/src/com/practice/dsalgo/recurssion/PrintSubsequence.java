/**
 * 
 */
package com.dsalgo.recurssion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Piyush Soni
 *
 */
public class PrintSubsequence {

	public static void main(String[] args) {
		int arr [] = {1,2,1};
		List<Integer> seqList = new ArrayList<>();
		printSubSequence(0,arr,seqList);
	}

	/**
	 * @param index
	 * @param arr
	 * @param seqList
	 */
	private static void printSubSequence(int index, int[] arr, List<Integer> seqList) {
		if (index == arr.length) {
			/*
			 * String result =
			 * seqList.stream().map(String::valueOf).collect(Collectors.joining(" "));
			 * System.out.println(result);
			 */
			
			 // Calculate the sum of the list
	        int sum = seqList.stream()
	                         .mapToInt(Integer::intValue) // Convert stream to IntStream
	                         .sum();

	        // If the sum is equal to 2, print the elements
	        if (sum == 2) {
	        	seqList.stream()
	                   .forEach(num -> System.out.print(num + " "));
	        	System.out.println("");
	        }
			return ;
		}
		seqList.add(arr[index]);
		printSubSequence(index+1,arr,seqList);
		seqList.remove((Integer)arr[index]);
		printSubSequence(index+1,arr,seqList);
		
	}
}
