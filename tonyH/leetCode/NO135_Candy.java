package com.tony.testAlgorithms;

import org.junit.Test;

import com.tony.tranditioanlAlgorithms.RamdomArray;

public class NO135_Candy {

	/*
	 * There are N children standing in a line. Each child is assigned a rating
	 * value.
	 * 
	 * You are giving candies to these children subjected to the following
	 * requirements:
	 * 
	 * Each child must have at least one candy. Children with a higher rating
	 * get more candies than their neighbors.
	 * 
	 * 
	 * Accepted:
	 * Run time: 7ms
	 * 
	 */

	@Test
	public void test() {

		int[] ratings = RamdomArray.getArray();
		int i = candy(ratings);
		System.out.println(i);

	}

	int candy(int[] ratings) {

		if (ratings == null || ratings.length == 0)
			return 0;
		if (ratings.length == 1)
			return 1;
		int count = 0;

		int[] sugre = new int[ratings.length];

		for (int j = 0; j < ratings.length; j++) {
			sugre[j] = 1;
		}

		for (int i = 0; i < ratings.length; i++) {

			if (i > 0 && ratings[i] > ratings[i - 1]) {
				sugre[i] = sugre[i - 1] + 1;
			}

			if (i < ratings.length - 1 && ratings[i] > ratings[i + 1] && sugre[i] <= sugre[i + 1]) {

				sugre[i] = sugre[i + 1] + 1;

			}

		}

		for (int j = ratings.length - 1; j >= 0; j--) {
			if (j > 0 && ratings[j - 1] > ratings[j] && sugre[j - 1] <= sugre[j]) {
				sugre[j - 1] = sugre[j] + 1;
			}
			if (j == ratings.length - 1 && ratings[j] > ratings[j - 1] && sugre[j] <= sugre[j - 1]) {
				sugre[j] = sugre[j - 1] + 1;
			}

		}

		for (int i : sugre) {
			System.out.print(i + " ");
			count += i;
		}
		System.out.println();

		return count;

	}

}
