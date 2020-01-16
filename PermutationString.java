package com.test;

public class PermutationString {
	public static void main(String args[]) {
		String str = "ABC";
		PermutationString per = new PermutationString();
		per.calculate(str,0,str.length()-1);
	}

	private void calculate(String str,int left,int right) {
		
		if(left == right) {
			System.out.println(str);
		}
		else {
			for(int i=left;i<=right;i++) {
				String swapped = this.swap(str,left,i);
				this.calculate(swapped,left+1,right);
			}
		}
	}
	
	private String swap(String str,int i,int j) {
		char temp;
		char[] tempArray = str.toCharArray();
		temp = tempArray[i];
		tempArray[i] = tempArray[j];
		tempArray[j] = temp;
		
		return String.valueOf(tempArray);
	}
}
