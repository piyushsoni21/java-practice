package com.dsalgo;

class A {
	public void methodA() throws ArrayIndexOutOfBoundsException{
		System.out.println("methodA");
	}
	
	public void methodA(String a, int ag ) {
		System.out.println("methodA");
	}
	
	void namesDetails(int... gname ){
		for(int g :gname) {
			System.out.println(g);
		}
	}
}


class B extends A {
	public void methodA() throws IndexOutOfBoundsException {
		System.out.println("methodB");
	}
}

public class MethodOverridingExercise {
	
	private static int increment(int i) {
		int num = (++i) + (i++);
		return num;
		}


	public static void main(String[] args) {
		//A a = new B();
		Integer a = 128;
		Integer b = 128;
		if(a == b) {
			System.out.println(true);
		}
		
	}
}
