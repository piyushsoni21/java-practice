/**
 * 
 */
package com.dsalgo;

/**
 * @author Piyush Soni
 *
 */

class Parent {
	public Parent m1() {
		System.out.println("parent");
		return this;
	}
}
public class Practice extends Parent {

	public Practice m1() {
		System.out.println("child");
		return this;
	}
	
	public static void main(String[] args) {
		Parent p = new Practice();
		//p.m1();
		Integer m1 =128;
		Integer m2 =128;
		if(m1 == m2 ) {
			System.out.println(true); 
		}else {
			System.out.println(false); 
		}
		
	}
	
	private static void test(String... b) {
		
	}
}
