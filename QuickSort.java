package com.test;

public class QuickSort {
	public static void main(String args[]) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
       //quickSort(a,0,a.length -1);
       //partitionLogic(a,0,a.length-1);
		quickSortNew(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static void quickSortNew(int[] list, int low, int high) {
// TODO Auto-generated method stub
		if (low >= high) {
			return;
		} else {
			int index = partitionLogic(list, low, high);
			quickSortNew(list, low, index);
			quickSortNew(list, index + 1, high);
		}
	}

	private static void quickSort(int[] list, int low, int high) {
		/*
		 * if(low < high + 1) { int pIndex = partitionNewLogic(list,low,high);
		 * quickSort(list, low, pIndex -1); quickSort(list, pIndex + 1, high); }
		 */
		if (low < high + 1) {
			int index = partitionLogic(list, low, high);
			quickSort(list, low, index);
			quickSort(list, index + 1, high);
		}

	}

	private static int partitionLogic(int[] list, int low, int high) {
// TODO Auto-generat,ed method stub
		int pivot = low, left = low, right = high;
		while (left < right) {
			while (list[left] <= list[pivot]) {
				left++;
			}
			while (list[right] > list[pivot]) {
				right--;
			}
			if (left < right) {
				swap(list,left,right);
//				int temp = list[left];
//				list[left] = list[right];
//				list[right] = temp;
//				left++;
//				right--;
			}
			if (left > right) {
				swap(list, pivot, right);
			}
		}

		return right;
	}

	private static int partitionNewLogic(int[] A, int low, int high) {
		int border = low + 1;
		for (int i = border; i <= high; i++) {
			if (A[i] < A[low]) {
				swap(A, i, border++);
			}
		}
		swap(A, low, border - 1);
		return border - 1;
	}

	private static void swap(int[] a, int pivot, int right) {
// TODO Auto-generated method stub
		int temp = a[pivot];
		a[pivot] = a[right];
		a[right] = temp;
	}

}
