/**
 * 
 */
package com.polymorphism;

/**
 * @author Piyush Soni
 *
 */
 class Parent{
	public static int m = 10;
	private static String name = "Piyush";
	 public static void printValue() {
		 System.out.println("Value of m is " + m);
	 }
}
 
  class Child extends Parent{
	  static String name = "Soni";
		// int m = 11;
		 
		/*
		 * public void printValue() { System.out.println("Value of m is " + m); }
		 */
	}
public class PolymorphTest1 {
  public static void main(String[] args) {
	Child c = new Child();
	Child.printValue();
	
	Child p = new Child();
	System.out.println(p.name);
}
}
