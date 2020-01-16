package com.test;

import java.util.ArrayList;
import java.util.List;

public class CalculateNumber {
	
	static List<char[]> operandList = new ArrayList<char[]>();
	static List<char[]> numberList = new ArrayList<char[]>();
	
	private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            numberList.add(str.toCharArray());    
        else { 
            for (int i = l; i <= r; i++) { 
                str = swap(str, l, i); 
                permute(str, l + 1, r); 
                str = swap(str, l, i); 
            } 
        } 
    } 
  
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
    
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

	public static int applyOp(char op, int b, int a) {
		switch (op) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				throw new UnsupportedOperationException("Cannot divide by zero");
			return a / b;
		}
		return 0;
	}

	public static void main(String args[]) {
		char operands[] = { '/', '+', '*', '-', '*' };
		int numbers[] = { 7,3,3,8,1,6 };
		
		int finalValue = 250;
		int a, b, j = 0, i = 0, temp = 0;
		while (j < operands.length) {
			System.out.println("test");
			while (i < numbers.length) {
				a = temp;
				if (i == 0) {
					a = numbers[i];
					b = numbers[i + 1];
					i = i + 1;
				} else {	
					b = numbers[i];
				}

				temp = applyOp(operands[j], b, a);
				i++;
				j++;
			}
		}
		System.out.println(temp);
	}

}
