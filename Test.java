package com.test;
import java.util.*;

public class Test {
	
	public static void main(String args[]) {
		int A[] = {3,4,5,3,7};
		int a = solution(A);
		System.out.println(a);
	}

	private static int solution(int[] a) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i = 1; i+1 < a.length;) {
			
			if(a[i-1] < a[i] && a[i] > a[i+1] ) {
				
			}
			else if(a[i-1] > a[i] && a[i] < a[i+1]) {
				
			}
			else {
				a=a;
			}
			i = i+ 2;
		}
		return count;
	}

}
