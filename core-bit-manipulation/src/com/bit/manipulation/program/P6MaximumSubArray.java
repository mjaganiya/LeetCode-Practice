package com.bit.manipulation.program;

public class P6MaximumSubArray {

	public int countMaximumSubArray(int num[]) {
		int sum = num[0];
		int result = sum;
		for (int i = 1; i < num.length; i++) {
			sum = Math.max(num[i], num[i] + sum);
			result = Math.max(sum, result);
		}
		return result;
	}

	public int countResult(int num[]) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i : num) {
			sum = sum + i;
			if (sum > maxSum) {
				maxSum = sum;
			}
			if(sum<0) {
				sum = 0;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		P6MaximumSubArray p6MaximumSubArray = new P6MaximumSubArray();
		int num[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Result:" + p6MaximumSubArray.countResult(num));
	}

}
