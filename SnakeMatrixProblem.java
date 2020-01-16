package com.test;

import java.util.*;

class SnakeMatrixProblem {
	// Function to form a matrix from snake
	static void snakeMatrix(int m, int n, int a[][]) {
		int i, k = 0, l = 0;
		/*
		 * k - starting row index 
		 * m - ending row index 
		 * l - starting column index 
		 * n - ending column index 
		 * i - iterator
		 */
		int j = 1;
		while (k < m && l < n) {
			for (i = l; i < n; ++i) {
				a[k][i] = j;
				j++;
			}
			k++;
			for (i = k; i < m; ++i) {
				a[i][n - 1] = j;
				j++;
			}
			n--;
			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					a[m - 1][i] = j;
					j++;
				}
				m--;
			}
			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					a[i][l] = j;
					j++;
				}
				l++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to form a square");
		int rows = 0;
		try {
			rows = sc.nextInt();
			if (0 == rows) {
				System.out.println("Please enter value greater than zero and try again");
			  return;	
			}
		} catch (InputMismatchException e) {	
			System.out.println("Please enter a valid number and try again");
			return;
		} finally {
			sc.close();
		}
		int columns = rows;
		int mat[][] = new int[rows][columns];
		snakeMatrix(rows, columns, mat);
		// Print Snake matrix
		for (int i = 0; i < mat.length; i++) {
			System.out.println();
			// Loop through all elements of current row
			for (int j = 0; j < mat[i].length; j++)
				System.out.print(mat[i][j] + " ");
		}
	}

}
