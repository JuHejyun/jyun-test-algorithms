package com.jyun.test.algorithms.leetcode;

import org.junit.Test;

public class Test01 {
	public void sortColors(int[] nums) {
		int zero = -1, one = 0, two = nums.length;
		while (one < two) {
			if (nums[one] == 0) {
				swap(nums, ++zero, one++);
			} else if (nums[one] == 2) {
				swap(nums, --two, one);
			} else {
				++one;
			}
		}
	}

	private void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}


	@Test
	public void testSortColors(){
		int[] arr = {2,0,2,1,1,0};
		sortColors(arr);
		System.out.println(arr.toString());
	}


}
