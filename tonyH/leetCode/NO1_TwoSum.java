package com.tony.testAlgorithms;

import org.junit.Test;

public class NO1_TwoSum {

	/**
	 * Given an array of integers, return indices of the two numbers such that
	 * they add up to a specific target.
	 * 
	 * You may assume that each input would have exactly one solution.
	 * 
	 * Example: Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
	 * 
	 * 
	 * Use bubble sort concept, finished in 38ms Potential for improving.
	 * 
	 */

	@Test
	public void testTwoSum() {

		int[] array = { -1, -2, -3, -4, -5 };
		int target = -8;
		int[] solution = twoSum(array, target);

		for (int i : solution) {
			System.out.println(i);
		}

	}

	public int[] twoSum(int[] nums, int target) {
		int firstIndex = -1;
		int secondIndex = -1;
		int[] array = null;

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if ((nums[i] + nums[j]) == target) {

					firstIndex = i;
					secondIndex = j;
					if (firstIndex == secondIndex)
						firstIndex = 0;
					array = new int[] { firstIndex, secondIndex };
					return array;
				}

			}

		}

		return array;
	}

}