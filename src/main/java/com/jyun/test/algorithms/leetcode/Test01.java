package com.jyun.test.algorithms.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01 {

	/**
	 * 荷兰国旗问题
	 * @param nums
	 */
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


	/**
	 * 按照字符出现次数对字符串排序
	 * @param s
	 * @return
	 */
	public String frequencySort(String s) {
		Map<Character, Integer> frequencyForNum = new HashMap<>();
		for (char c : s.toCharArray())
			frequencyForNum.put(c, frequencyForNum.getOrDefault(c, 0) + 1);

		List<Character>[] frequencyBucket = new ArrayList[s.length() + 1];
		for (char c : frequencyForNum.keySet()) {
			int f = frequencyForNum.get(c);
			if (frequencyBucket[f] == null) {
				frequencyBucket[f] = new ArrayList<>();
			}
			frequencyBucket[f].add(c);
		}
		StringBuilder str = new StringBuilder();
		for (int i = frequencyBucket.length - 1; i >= 0; i--) {
			if (frequencyBucket[i] == null) {
				continue;
			}
			for (char c : frequencyBucket[i]) {
				for (int j = 0; j < i; j++) {
					str.append(c);
				}
			}
		}
		return str.toString();
	}

	@Test
	public void testFrequencySort(){
		String str = "In simple QuickSort algorithm, we select an element as pivot, partition the array around pivot and recur for subarrays on left and right of pivot. ";
		String s = frequencySort(str);
		System.out.println(s);
	}
}
