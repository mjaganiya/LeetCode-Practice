package com.bit.manipulation.program;

public class P3IntegerPaliandrome {

	public boolean checkPalindrome(int n) {
		if(n<0)return false;
		int orignal = n;
		int reverse = 0;
		while (orignal > 0) {
			reverse = reverse * 10 + orignal % 10;
			orignal = orignal / 10;
		}
		if(reverse==n)return true;
		return false;
	}

	public static void main(String[] args) {
		P3IntegerPaliandrome p3IntegerPaliandrome = new P3IntegerPaliandrome();
		System.out.println("Result: " + p3IntegerPaliandrome.checkPalindrome(-121));
	}

}
