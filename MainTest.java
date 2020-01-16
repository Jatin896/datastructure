package com.test;

public class MainTest extends TestAbstract {
	
	MainTest(){
		super();
		System.out.println("ssafsdf");
		
	}
	
	public void test() {
		System.out.println("dsfsdfdsgsdggs");
		super.test();
		System.out.println("In Main class");
	}
	
	public void test1() {
		super.test();
	}


}
