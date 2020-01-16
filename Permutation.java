package com.test;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
    /* arr[]  ---> Input Array 
    data[] ---> Temporary array to store current combination 
    start & end ---> Staring and Ending indexes in arr[] 
    index  ---> Current index in data[] 
    r ---> Size of a combination to be printed */
   
    /*Driver function to check for above function*/
	
	static List<char[]> operandList = new ArrayList<char[]>();
	
	static void printAllKLength(char[] set, int k) 
	{ 
	    int n = set.length;  
	    printAllKLengthRec(set, "", n, k); 
	} 
	  
	// The main recursive method 
	// to print all possible  
	// strings of length k 
	static void printAllKLengthRec(char[] set,  
	                               String prefix,  
	                               int n, int k) 
	{ 
	      
	    // Base case: k is 0, 
	    // print prefix 
	    if (k == 0)  
	    { 
	       // System.out.println(prefix); 
	        operandList.add(prefix.toCharArray()); 
	        return; 
	    } 
	  
	    // One by one add all characters  
	    // from set and recursively  
	    // call for k equals to k-1 
	    for (int i = 0; i < n; ++i) 
	    { 
	  
	        // Next character of input added 
	        String newPrefix = prefix + set[i];  
	          
	        // k is decreased, because  
	        // we have added a new character 
	        printAllKLengthRec(set, newPrefix,  
	                                n, k - 1);  
	    } 
	} 
    public static void main (String[] args) { 
        char[] set1 = {'+', '-','/','*'}; 
        int k = 5; 
        printAllKLength(set1, k); 
        operandList.forEach(c -> System.out.println(c));   
    }

}
