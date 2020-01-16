package com.test;

public class Task {
	static
	{
		System.out.println("in sta");
	}
	{
		System.out.println("in in");
	}
	
	Task(){
		System.out.println("in task");
	}
	
	public static void main(String args[]) {
		
		new Task();
	}

}
