package com.tony.tranditioanlAlgorithms;

import org.junit.Test;

public class InsertionSort {

	/**
	 * Insertion Sort:
	 * Best case: 𝛺(n)
	 * Average: 𝛳(n*n)
	 * Worst case: O(n*n)
	 * 
	 * Space Complexity: O(1)
	 * 
	 * 
	 */
	
	
	@Test
	public void testInsertionSort() {

		int[] array = RamdomArray.getArray();

		System.out.println("Before: ");
		for(int j: array){
			System.out.print(j+" ");
		}
		
		System.out.println("\n");
		insertionSort(array);
		System.out.println("After: ");
		
		
		for (int i : array) {
			System.out.print(i+" ");
		}

	}

	void insertionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			int j = i;
			while (j >= 0 && array[j] > array[j + 1]) {

				swap(array, j);
				j--;
			}

		}

	}

	void swap(int[] array, int index) {

		int temp = array[index];
		array[index] = array[index + 1];
		array[index + 1] = temp;

	}

}
