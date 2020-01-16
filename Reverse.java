package com.test;

public class Reverse {
	public static void main(String args[]) {
		String a = "xyz abc am hero jatin";
		char[] cArr = a.toCharArray();
		Reverse r = new Reverse();
		r.reverse(cArr, 0, cArr.length - 1);
		int s = 0;
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] == ' ') {
				r.reverse(cArr, s, i - 1);
				s = i + 1;
			}
		}
//call for the last word in the sentence
		r.reverse(cArr, s, cArr.length - 1);
		System.out.println(cArr);
	}

	public void reverse(char c[], int i, int j) throws RuntimeException {
		char t;
		while (i < j) {
			t = c[i];
			c[i] = c[j];
			c[j] = t;
			i++;
			j--;
		}
	}

}
