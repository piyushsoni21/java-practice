/**
 * 
 */
package com.polymorphism;

/**
 * @author Piyush Soni
 *
 */
public class TestOverloading {

	public void calc(int i ,float j) {
		System.out.println("first int");
	}
	
	public void calc(float i ,int j) {
		System.out.println("first float");
	}
	
	public static void main(String[] args) {
		TestOverloading obj = new TestOverloading();
		obj.calc(5, 5.5f);
		obj.calc(5.5f, 5);
	}
}
