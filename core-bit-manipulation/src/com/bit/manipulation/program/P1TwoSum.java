package com.bit.manipulation.program;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class P1TwoSum {
	public int[] checkTragetSum(int[] dataSource, int target) {
		Map<Integer, Integer> inputChecker = new HashMap<>();
		for (int i = 0; i < dataSource.length; i++) {
			if (inputChecker.containsKey(dataSource[i])) {
				return new int[] { inputChecker.get(dataSource[i]), i };
			} else {
				inputChecker.put(target - dataSource[i], i);
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {

		P1TwoSum p1TwoSum = new P1TwoSum();
		int[] input = { 2, 7, 15, 19 };
		int target = 9;
		int[] output = p1TwoSum.checkTragetSum(input, target);
		System.out.print("Output is : [");
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
			if (i != output.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
}
