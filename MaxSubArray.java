package com.test;

public class MaxSubArray {
	 public static void main(String[] args) 
	    { 
	        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 }; 
	        int n = a.length; 
	        maxSubArraySum(a, n); 
	    } 
	 
	 static void maxSubArraySum(int a[], int size) 
	 { 
	     int maxSum = Integer.MIN_VALUE, 
	     tempSum = 0,start = 0, 
	     end = 0, s = 0; 

	     for (int i = 0; i < size; i++)  
	     { 
	    	 tempSum += a[i]; 

	         if (maxSum < tempSum)  
	         { 
	        	 maxSum = tempSum; 
	             start = s; 
	             end = i; 
	         } 

	         if (tempSum < 0)  
	         { 
	        	 tempSum = 0; 
	             s = i + 1; 
	         } 
	     } 
	     System.out.println("Maximum contiguous sum is " 
	                        + maxSum); 
	     System.out.println("Starting index " + start); 
	     System.out.println("Ending index " + end); 
	 } 

}

