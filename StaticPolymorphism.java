package com.test;

public class StaticPolymorphism {
	
//	public void test(int i) {
//		System.out.println("In int i");
//	}
	
//	public void test(Double i) {
//		System.out.println("In double i");
//	}
	
	public void test(float i) {
		System.out.println("In float i");
		}
	
//	public void test(long i) {
//		System.out.println("In long i");
//	}
	public static void main(String args[])
	{
		int a = 7;
		StaticPolymorphism st = new StaticPolymorphism();
		st.test(a);
		
	}

}
