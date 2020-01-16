package com.test;

@FunctionalInterface
public interface Calclulate {
	
	void calculate(); 
	
	public static void print3erew() {
		System.out.println("test");
	}
	default public void print1() {
		System.out.println("test");
	}
	
	public static void test() {
		
	}
	
}
