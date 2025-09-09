/**
 * 
 */
package com.practice.regionproject.base.reason.controller;

/**
 * @author Piyush Soni
 *
 */
public class RegionMain {

	
	public static void main(String[] args) {
		RegionMain mainR = new RegionMain();
		R1 r1 = new R1();
		int count = 10;
		Integer m1 = 128;
		Integer m2 = 128;
		if(m1 ==m2 ) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		//mainR.test1(count);
		//System.out.println(count); 
	}
	
	private void testMethod(int count) {
		count++;
	}
}
