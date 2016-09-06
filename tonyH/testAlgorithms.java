package com.tony.testAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;

public class testAlgorithms {

	/*
	 * 
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
	 * 
	 */

	@Test
	public void testTwoSum() {

		int[] nums = { 3, 4, 1, 7, 8, 4, 5, 2, 6, 9 };
		int target = 8;

		twoSum(nums, target);
	}

	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			map.put(i, nums[i]);
		}

		// Set set = map.entrySet();
		//
		//
		// for(Object i: set){
		//
		// Map.Entry entry = (Entry) i;
		// System.out.println(entry);
		//
		// }

		Set set = map.keySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {

			int i = (int) it.next();
			System.out.println(i + "=" + map.get(i));

		}

		return null;

	}

	/*
	 * Given an array of integers, find if the array contains any duplicates.
	 * Your function should return true if any value appears at least twice in
	 * the array, and it should return false if every element is distinct.
	 * 
	 * 
	 */
	@Test
	public void testContainDuplicate() {
		int[] nums = { 5, 7, 1, 45, 8, 4, 99, 23 };

		boolean b = containDuplicate2(nums);
		System.out.println(b);
	}

	public boolean containDuplicate2(int[] nums) {

		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {

			if ((i + 1) < nums.length && nums[i] == nums[i + 1]) {

				return true;
			}

		}

		return false;

	}

	public boolean containDuplicate(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			int k = i + 1;
			while (k < nums.length) {
				if (nums[i] == nums[k]) {
					return true;

				}

				k++;

			}

		}

		return false;

	}

	/*
	 * 
	 * Given a positive integer, return its corresponding column title as appear
	 * in an Excel sheet.
	 *
	 * For example:
	 *
	 * 1 -> A 2 -> B 3 -> C ... 26 -> Z 27 -> AA 28 -> AB
	 * 
	 * 
	 * 
	 */

	@Test
	public void testConverToTitle() {

		//
		// int n = 65;
		// System.out.println(707%26);
		// for(int i = 65; i< 91;i++){
		//
		// System.out.println((char)i);
		//
		// }

		System.out.println(707 / 26);

		System.out.println(converToTitle(707));

	}

	public String converToTitle(int n) {

		String columnStr = null;

		if (n >= 1) {

			int digtal = (n / 26);
			int lastNum = (n % 26);

			if (digtal == 0) {

				char temp = (char) (lastNum + 64);
				columnStr = String.valueOf(temp);

			} else if (digtal > 26) {

			}

			else {

				columnStr = String.valueOf((char) (digtal + 64));

				char k = (char) (lastNum + 64);
				columnStr += k;
			}
		}

		return columnStr;
	}

	/*
	 * Given two strings s and t, write a function to determine if t is an
	 * anagram of s.
	 *
	 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t =
	 * "car", return false.
	 *
	 * Note: You may assume the string contains only lowercase alphabets.
	 *
	 * Follow up: What if the inputs contain unicode characters? How would you
	 * adapt your solution to such case?
	 * 
	 */
	@Test
	public void testAnagram() {

		String s = "anagram";
		String t = "nagrapm";

		System.out.println(isAnagram(s, t));

	}

	public boolean isAnagram(String s, String t) {

		if (s.length() == t.length()) {

			char[] sA = s.toCharArray();
			char[] tA = t.toCharArray();
			// System.out.println(sA.length);

			List slist = new ArrayList();
			List tlist = new ArrayList();

			for (int k = 0; k < sA.length; k++) {

				slist.add(sA[k]);
				tlist.add(tA[k]);
			}

			System.out.println(slist.size());
			System.out.println(slist);

			for (int i = 0; i < sA.length; i++) {

				if (tlist.contains(slist.get(i))) {

					tlist.remove(slist.get(i));

				}

			}

			if (tlist.isEmpty()) {
				return true;
			} else {
				System.out.println(tlist);
				return false;
			}

		}

		return false;
	}

	/*
	 * Given an array of numbers nums, in which exactly two elements appear only
	 * once and all the other elements appear exactly twice. Find the two
	 * elements that appear only once.
	 * 
	 * For example:
	 * 
	 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
	 * 
	 * Note: The order of the result is not important. So in the above example,
	 * [5, 3] is also correct. Your algorithm should run in linear runtime
	 * complexity. Could you implement it using only constant space complexity?
	 * 
	 * 
	 * 
	 */

	@Test
	public void testSingleNumberIII() {

		int[] nums = { -1, 1, 2, 2, 5, 6 };

		int[] h = singleNumber(nums);

		for (int o : h) {
			System.out.println(o);
		}

	}

	public int[] singleNumber(int[] nums) {

		List<Integer> list = new ArrayList<>();
		List<Integer> compare = new ArrayList<>();
		int[] answer = null;

		for (int num : nums) {
			System.out.println(num);

			if (list.contains(num)) {
				compare.add(num);
			} else {
				list.add(num);
			}

		}
		System.out.println(compare);
		System.out.println(list);

		if (!compare.isEmpty()) {

			for (Integer c : compare) {

				list.remove(c);
			}

		}
		System.out.println(list);

		if (!list.isEmpty()) {
			int size = list.size();
			answer = new int[size];
			for (int i = 0; i < size; i++) {
				answer[i] = list.get(i);

			}
		}

		return answer;
	}

	/*
	 * Given an array nums, write a function to move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements.
	 * 
	 * For example, given nums = [0, 1, 0, 3, 12], after calling your function,
	 * nums should be [1, 3, 12, 0, 0].
	 * 
	 * Note: You must do this in-place without making a copy of the array.
	 * Minimize the total number of operations.
	 * 
	 * 
	 */
	@Test
	public void testMoveZeros() {

		int[] nums = { 0, 0, 0, 0, 0, 0 };

		moveZeros2(nums);

	}

	public void moveZeros2(int[] nums) {

		int index = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {
				nums[index] = nums[i];
				index++;

			}

		}

		if (index != 0) {

			for (int k = index; k < nums.length; k++) {

				nums[k] = 0;

			}

		}

		for (int num : nums) {
			System.out.println(num);
		}

	}

	public void moveZeros(int[] nums) {

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {

				queue.add(nums[i]);

			}

		}

		for (int k = 0; k < nums.length; k++) {

			if (!queue.isEmpty()) {
				nums[k] = queue.poll();

			} else {
				nums[k] = 0;

			}

		}

		for (int num : nums) {

			System.out.println(num);
		}

	}

	/*
	 * Given a non-negative integer num, repeatedly add all its digits until the
	 * result has only one digit.
	 * 
	 * For example:
	 * 
	 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has
	 * only one digit, return it.
	 * 
	 * Follow up: Could you do it without any loop/recursion in O(1) runtime?
	 * 
	 */
	@Test
	public void testAddDigits() {

		int sum = addDigits(1998);
		System.out.println(sum);

	}

	public int addDigits(int num) {

		String numStr = Integer.toString(num);
		int sum = 0;

		if (numStr.length() == 1) {
			return num;
		}

		for (int i = 0; i < numStr.length(); i++) {

			sum += Integer.parseInt(String.valueOf(numStr.charAt(i)));

		}

		int an = addDigits(sum);

		return an;

		// if(numStr.length() == 1){
		// return Integer.parseInt(numStr);
		// }
		//
		// while (numStr.length() > 1) {
		// for (int i = 0; i < numStr.length(); i++) {
		//
		// tem += Integer.parseInt(String.valueOf(numStr.charAt(i)));
		//
		// }
		// sum = addDigits(tem);
		// }
		//
		// return sum;
	}

	@Test
	public void testNormal() {

		hello[] array = new hello[6];

		hello k = new hello();
		System.out.println(k);

		for (hello h : array) {

			System.out.println(h);
		}

	}

	@Test
	public void testSwitch() {

		Scanner input = new Scanner(System.in);
		final int x = 2;
		final int i = input.nextInt();
		switch (i) {
		case 1:
			System.out.println(i);
			break;
		case x:
			System.out.println(i);
			break;
		default:
			System.out.println(0);

		}

	}

	@Test
	public void testArray() {

		int[] array = null;
		for (int k : array) {
			System.out.println(k);

		}

	}

	@Test
	public void testExceptions() {

		doSomthing();

	}

	private void doSomthing() {

		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class hello {

	public hello() {

	}

	@Override
	public String toString() {
		return "hi";
	}

}
