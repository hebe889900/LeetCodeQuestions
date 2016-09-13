package com.tony.testAlgorithms;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class No3_LongestSubstring {

	@Test
	public void testLongSubS() {

		String str = "au";
		int max = lengthOfLongestSubstring(str);
		System.out.println(max);

	}

	public int lengthOfLongestSubstring(String s) {

		char[] charA = s.toCharArray();
		int max = -1;
		List<Character> list = new ArrayList<>();

		for (int i = 0; i < charA.length; i++) {

			for (int j = i; j < charA.length; j++) {
				System.out.println(charA[j] + " : " + list);

				if (list.contains(charA[j])) {

					if (list.size() > max) {
						max = list.size();
					}
					break;
				}

				list.add(charA[j]);
				if (j == charA.length - 1) {
					if (list.size() > max) {
						max = list.size();
					}
				}

				System.out.println(list);
			}

			list.clear();

		}

		return max;

	}

}
