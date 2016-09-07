package com.tony.tranditioanlAlgorithms;

import org.junit.Test;

public class SelectionSort {

	/**
	 * Selection Sort:
	 * Best Case: O(n*n)
	 * Average: O(n*n)
	 * Worst Case: O(n*n)
	 * 
	 * Space Complexity: O(1)
	 * 
	 * 
	 */
	
	
	@Test
	public void testSelectionSort() {

		int[] array = RamdomArray.getArray();

		System.out.println("Before: ");
		for (int i : array) {

			System.out.print(i + " ");
		}

		selectionSort(array);
		System.out.println("\n");

		System.out.println("After: ");
		for (int j : array) {

			System.out.print(j + " ");
		}

	}

	void selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			int index = i;
			for (int j = i + 1; j < array.length; j++) {

				if (array[index] > array[j]) {
					index = j;
				}

			}

			RamdomArray.swap(array, i, index);

		}

	}

}
