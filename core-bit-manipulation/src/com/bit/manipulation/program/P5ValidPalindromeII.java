package com.bit.manipulation.program;

public class P5ValidPalindromeII {

	public boolean check(CharSequence s) {
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i))return false;
		}
		return true;
	}
	private boolean isPaliandrome(String s) {
		StringBuilder ss = new StringBuilder(s);		
		for(int i=0;i<s.length();i++) {
			char c = ss.charAt(i);
			ss.deleteCharAt(i);
			if(check(ss)==true)return true;
			ss.insert(i,c);
		}
		return check(ss);
	}

	public boolean isPalindromeRange(String s, int i, int j) {
        for (int k = i; k <= i + (j - i) / 2; k++) {
            if (s.charAt(k) != s.charAt(j - k + i)) return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                int j = s.length() - 1 - i;
                return (isPalindromeRange(s, i+1, j) ||
                        isPalindromeRange(s, i, j-1));
            }
        }
        return true;
    }
	public static void main(String[] args) {
		P5ValidPalindromeII p5ValidPalindromeII = new P5ValidPalindromeII();
		String s = "abfdfdrfa";
		System.out.println("Result : " + p5ValidPalindromeII.validPalindrome(s));
	}

}
