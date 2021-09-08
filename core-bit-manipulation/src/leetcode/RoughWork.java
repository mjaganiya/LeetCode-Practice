package leetcode;

import java.math.BigInteger;

public class RoughWork {
    public static void main(String[] args) {
        String num = "7542351161";
        int i = num.length()-1;
        while(i>=0 && (num.charAt(i)-'0')%2==0) i--;
        String s = i==-1?"":num.substring(0,i+1);
        System.out.println(s);
    }
}
