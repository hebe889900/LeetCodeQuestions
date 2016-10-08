package leetCode.defaultClasses;

import org.junit.Test;

/*
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * 
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 */

public class No189_RotateArray {

	
	@Test
	public void test() {

		int[] arr = {1,2,3,4,5,6,7};
		
		int num = 3;
		rotate(arr, num);
		
		for(int i : arr){
			System.out.println(i);
		}
		
	}

	/*
	 * 
	 * Solution1:
	 * Runtime: 1s
	 * beats 12.84% of Java submissions.
	 */
	public void rotate(int[] nums, int k) {
		int[] result = null;
		if (nums != null && k >= 0) {
			if(k > nums.length){
				k = k - nums.length;
			}
			
			result = new int[nums.length];
			int index = nums.length - k;
			for (int i = index, j = 0; i < nums.length; i++, j++) {
				result[j] = nums[i];
			}

			for (int y = 0, o = k; y < index; y++, o++) {

				result[o] = nums[y];

			}

			for(int i = 0; i < nums.length; i++){
				nums[i] = result[i];
			}
		}
	}

}
