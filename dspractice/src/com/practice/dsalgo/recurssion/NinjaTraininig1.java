/**
 * 
 */
package com.dsalgo.recurssion;

/**
 * @author Piyush Soni
 *
 */
public class NinjaTraininig1 {

	
	private static int calculateMaxPoints(int day,int tp[][],int lastTask) {
		if(day ==0) {
			int maxi = 0;
			for (int task = 0;task <tp.length;task++) {
				if(task!=lastTask) {
					maxi = Math.max(maxi, tp[0][task]);
				}
			}
			return maxi;
		}
		int maxi =0;
		for(int i = 0;i<tp.length;i++) {
			if(i !=lastTask) {
				int points = tp[day][i] + calculateMaxPoints(i-1, tp, i);
				maxi = Math.max(maxi,points);
			}
		}
		
		
		return maxi;
	}
	
	public static void main(String[] args) {
		int trainingPoints [][]= {
				{2,1,3},
				{3,4,6},
				{10,1,6},
				{8,3,7}
		};
		
		int maxPointsObtained = calculateMaxPoints(3, trainingPoints, 0);
	}
}
