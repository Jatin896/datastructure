package com.test;

public class Main {

	public void test1(int a) {
		System.out.println("asdsf" + a);
	}
	public static void main(String args[]) {
		//Main m = new Main();
		//byte a = 2;
		//m.test1(a);
		//int a = 'Z';
		//MainTest m = new MainTest();
		//m.test();
		//System.out.println(a);
		int n = 7;
		MergeNode mergeNodeArr[] = new MergeNode[n];
		 int arr[] = {8,2,10,12,3,11,55};
//		//int arr[] = { 4,11,55,70,2};
//		 int arr[] = {3,7,1,5,2,9,11,45,8};
//
		for (int i = 0; i < n; i++) {
			mergeNodeArr[i] = new MergeNode();
			mergeNodeArr[i].index = i;
			mergeNodeArr[i].value = arr[i];
			mergeNodeArr[i].count = 0;
		}
//
	MergeNode auxmergeNodeArr[] = new MergeNode[n];
		for (int i = 0; i < n; i++) {
			auxmergeNodeArr[i] = new MergeNode();
			auxmergeNodeArr[i].index = i;
			auxmergeNodeArr[i].value = arr[i];
			auxmergeNodeArr[i].count = 0;
		}
//
		dnc(0, n - 1, mergeNodeArr, auxmergeNodeArr);
         // System.out.println(auxmergeNodeArr.toString());
		for (MergeNode node : mergeNodeArr) {
			System.out.println(node.value + " -> " + node.count);
		}
//
	}

	private static void dnc(int low, int high, MergeNode[] arr, MergeNode[] aux) {
		// TODO Auto-generated method stub
		if (low >= high)
			return;
		int mid = (low + high) / 2;
		dnc(low, mid, arr, aux);
		dnc(mid + 1, high, arr, aux);
		selfMerge(low, mid, high, arr, aux);
	}

	private static void selfMerge(int low, int mid, int high, MergeNode[] arr, MergeNode[] aux) {
		int i = low;
		int j = mid+1;
		int k = high;
		while (i < j) {
			if (arr[j].value > arr[i].value) {
				arr[i].count = arr[i].count + 1;
			}
			if (j == k) {
				j = mid+1;
				i++;
			} else {
				j++;
			}
		}
	}

	private static void merge(int p, int q, int r, MergeNode[] arr, MergeNode[] aux) {
		int i = p;
		int j = q + 1;
		int k = p;

		while (i <= q && j <= r) {
			if (arr[i].value >= arr[j].value) {
				aux[k] = arr[j];
				j++;
				k++;
			} else {
				aux[k] = arr[i];
				aux[k].count = aux[k].count + 1;
				i++;
				k++;
			}
		}

		while (i <= q) {
			aux[k] = arr[i];
			aux[k].count = aux[k].count + 1;
			i++;
			k++;
		}

		while (j <= r) {
			aux[k] = arr[j];
			j++;
			k++;
		}

	}
}
