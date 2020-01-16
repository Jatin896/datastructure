package com.test;
import java.util.*;
class Combination { 
	
	// A utility method to apply an operator 'op' on operands 'a'  
    // and 'b'. Return the result. 
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

    /*Driver function to check for above function*/
    public static void main (String[] args) { 
    	String str = "123456"; 
        int n = str.length(); 
        Combination permutation = new Combination(); 
        permutation.permute(str, 0, n - 1); 
        numberList.forEach(c -> System.out.println(c));

    } 
}
