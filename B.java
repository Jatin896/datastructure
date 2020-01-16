package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class B extends A {
	
	public void msg() {
		System.out.println("In B msg");
	}
	int abc = 7;

	public static void main(String args[]) {
		A a =  new B();
		a.msg();
		//B b = new B();
		//b.testLambda();
	    //Calclulate calc = () -> System.out.println("Test functional programming");
		//calc.calculate();
		//passFunctionExample(calc);
		//System.out.println(passFunctionExample(() -> System.out.println("Test functional programming......")));
		
		//Calclulate calc1=passFunctionExample(() -> System.out.println("Test functional programming......"));
		//calc1.calculate();
		//List<Integer> list = Arrays.asList(1,2,3,4);
		//list.forEach(B :: doubleit);
	}
	
	private static Calclulate passFunctionExample(Calclulate calc) {
		// TODO Auto-generated method stub
		//System.out.println("TEST");
	 // calc.calculate();
	  return () -> System.out.println("Test functional programming......Testttt");
	}

	private static int doubleit(int i) {
		System.out.println(i*2);
		return i*2;
	}
	private void testLambda() {
		List<String> cities = new ArrayList<String>();
		cities.add("Ben");
		int test = 9;
		// test = test + 1 ;
		cities.forEach(city -> {
			abc = abc + 1;
			System.out.println(abc);
		});

	}

	static boolean isPrime(double n) {
		// Corner cases
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;

		// This is checked so that we can skip
		// middle five numbers in below loop
		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
			// System.out.println(i);
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}

		return true;
	}

}
