package com.tony.tranditioanlAlgorithms;

import org.junit.Test;

public class BubbleSort {

	/**
	 * Bubble Sort:
	 * 
	 * Best Case: 𝛺(n) 
	 * Average: 𝛳(n*n) 
	 * Worst Case:O(n*n)
	 * 
	 * Space Capacity: O(1)
	 * 
	 * 
	 */

	@Test
	public void testBubbleSort() {
		int[] array = RamdomArray.getArray();
		System.out.println("Before: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		bubbleSort(array);

		System.out.println("After bubble sort: ");
		for (int j : array) {
			System.out.print(j + " ");

		}

	}

	void bubbleSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[j] > array[j + 1]) {

					RamdomArray.swap(array, j, j + 1);
				}

			}

		}

	}

}
