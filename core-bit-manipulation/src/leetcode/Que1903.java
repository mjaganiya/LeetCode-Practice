package leetcode;

/**
 * 1903 Largest Odd Number in String
 *
 * You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 * Example 1:
 *
 * Input: num = "52"
 * Output: "5"
 * Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
 *
 */
public class Que1903 {
    static String getLargestOddCharachter(String num) {
        int i=num.length()-1;
        while(i>=0 && (num.charAt(i)-'0')%2==0) i--;
        return i==-1?"":num.substring(0,i+1);
    }
    public static void main(String[] args) {
    System.out.println(getLargestOddCharachter("2225")+" : "+getLargestOddCharachter("254")+" : "+getLargestOddCharachter("354278"));
    }
}
