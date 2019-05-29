package com.bit.manipulation.program;

public class P4StringPalindrome {
	private boolean checkPaliandrome(String s) {
		StringBuilder stringBuilder1 = new StringBuilder();
		String s1[] = s.split("\\W+");
		for (String ss : s1) {
			stringBuilder1.append(ss);
		}
		String test = stringBuilder1.toString().toLowerCase();
		for (int i = 0, j = test.length() - 1; i < j; i++, j--) {
			if (test.charAt(i) != test.charAt(j))
				return false;
		}
		return true;
	}

	public boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			char a = s.charAt(i);
			char b = s.charAt(j);
			if (!Character.isLetterOrDigit(a)) {
				i++;
			} else if (!Character.isLetterOrDigit(b)) {
				j--;
			} else {
				if (Character.toLowerCase(a) != Character.toLowerCase(b))
					return false;
				i++;
				j--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		P4StringPalindrome p4StringPalindrome = new P4StringPalindrome();
		String s1 = "A man, a plan, a canal: Panama";
		System.out.println("result :" + p4StringPalindrome.isPalindrome(s1));
		String s2 = "race a car";
		System.out.println("result :" + p4StringPalindrome.isPalindrome(s2));
	}

}
