package com.tony.tranditioanlAlgorithms;

import org.junit.Test;

public class QuickSort {

	/**
	 * 
	 * Quick Sort
	 * Best case: O(n logn)
	 * Average: O(n logn)
	 * Wrost case: O(n*n)
	 * 
	 * Space complexity: O(logn) 
	 */
	
	@Test
	public void testQuickSort() {
		int[] array = { 5, 342, 573, 32, 7, 86, 4, 12, 43, 75, 33 };

		int start = 0;
		int end = array.length - 1;

		quickSort(array, start, end);

		for (int i : array) {
			System.out.println(i);
		}

	}

	void quickSort(int[] array, int start, int end) {

		int pivotKey = partition(array, start, end);

		if (start < pivotKey - 1) {
			quickSort(array, start, pivotKey - 1);

		}

		if (end > pivotKey) {
			quickSort(array, pivotKey, end);
		}

	}

	int partition(int[] array, int left, int right) {

		int pivot = array[left];

		while (left <= right) {

			while (array[left] < pivot) {

				left++;

			}

			while (array[right] > pivot) {
				right--;

			}

			if (left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}

		}

		return left;

	}

	void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;

	}

}
