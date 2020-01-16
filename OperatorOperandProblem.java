package com.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class OperatorOperandProblem {

	static List<char[]> operatorList = new ArrayList<char[]>();
	static List<char[]> numberList = new ArrayList<char[]>();

	/**
	 * Method to add permutation of all given numbers.
	 * 
	 * @param arr
	 * @return
	 */
	public static List<List<Integer>> permute(int[] arr) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		permuteHelper(list, new ArrayList<>(), arr, new boolean[arr.length]);
		return list;
	}

	/**
	 * Helper method to get permutation of all integers.
	 * 
	 * @param list
	 * @param resultList
	 * @param arr
	 * @param used
	 */
	private static void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int[] arr, boolean[] used) {

		// Base case
		if (resultList.size() == arr.length) {
			list.add(new ArrayList<>(resultList));
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (used[i] || i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
					// If element is already used
					continue;
				}
				used[i] = true;
				resultList.add(arr[i]);
				permuteHelper(list, resultList, arr, used);
				used[i] = false;
				resultList.remove(resultList.size() - 1);
			}
		}
	}

	/**
	 * Permutation and combination of all operators.
	 * 
	 * @param set
	 * @param k
	 */
	static void permuteCombOfOperators(char[] set, int k) {
		int n = set.length;
		addAllCombOfOperator(set, "", n, k);
	}

	/**
	 * The main recursive method to add all operators combination strings of length
	 * k
	 * 
	 * @param set
	 * @param prefix
	 * @param n
	 * @param k
	 */
	static void addAllCombOfOperator(char[] set, String prefix, int n, int k) {
		if (k == 0) {
			operatorList.add(prefix.toCharArray());
			return;
		}
		for (int i = 0; i < n; ++i) {
			String newPrefix = prefix + set[i];
			addAllCombOfOperator(set, newPrefix, n, k - 1);
		}
	}

	/**
	 * Method to solve two operands according to given operands.
	 * 
	 * @param op
	 * @param b
	 * @param a
	 * @return
	 */
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
		Scanner scanner = new Scanner(System.in);
		char[] operators = { '+', '-', '/', '*' };
		// As of now we are doing only for 6 operands 
		//so only 5 operators are required but in future if you 
		//want it dynamic then we can take no of element from 
		//input element and operand we can subtract it by 1
		int operatorComb = 5;
		int arr[] = new int[6];
		int finalValue = 0;
		try {
			System.out.println("Enter set of six positive integers :- ");
			for (int i = 0; i < 6; i++) 
				arr[i] = scanner.nextInt();
			System.out.print("Enter value of Y");
			finalValue = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid number and try again");
			return;
		} finally {
			scanner.close();
		}
		permuteCombOfOperators(operators, operatorComb);
		List<List<Integer>> permute = permute(arr);
		List<String> sampleOutput = matchNumOperResult(permute, finalValue);
		System.out.println();
		if(sampleOutput.size() > 0) {
			 System.out.println("Sample output");
			 sampleOutput.forEach(System.out :: println);
			}
		else
			System.out.println("There was no matching solution with the given numbers(X1 .. X6) and Y ");
	}
	/**
	 * This method will do the permutation and combination with operator and operand. 
	 * @param permute
	 * @param finalValue
	 * @return
	 */
	private static List<String> matchNumOperResult(List<List<Integer>> permute, int finalValue) {
		List<String> sampleOutput = new ArrayList<String>();
		// TODO Auto-generated method stub
		int a, b, j = 0, i = 0, temp = 0;
		for (char[] operand : operatorList) {
			for (List<Integer> numArr : permute) {
				j = 0;
				i = 0;
				while (j < operand.length) {
					while (i < numArr.size()) {
						a = temp;
						if (i == 0) {
							a = numArr.get(i);
							b = numArr.get(i + 1);
							i = i + 1;
						} else {
							b = numArr.get(i);
						}
						temp = applyOp(operand[j], b, a);
						i++;
						j++;
					}
				}
				if (temp == finalValue) {
					i = 0;
					j = 0;
					StringBuilder sb = new StringBuilder();
					while (j < operand.length) {
						sb.append(numArr.get(j));
						sb.append(operand[j]);
						j++;
					}
					sb.append(numArr.get(numArr.size() - 1));
					sb.append(" = " + finalValue);
					sampleOutput.add(sb.toString());
				}
			}

		}
		return sampleOutput;
	}
}
