package leetcode;

import java.util.Arrays;

/**
 * 1920. Build Array from Permutation
 *
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 *
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,2,1,5,3,4]
 * Output: [0,1,2,4,5,3]
 * Explanation: The array ans is built as follows:
 * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
 *     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
 *     = [0,1,2,4,5,3]
 *
 */
public class Que1920 {

    static int[] getArrayFromPermutation(int[] arr) {
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++)res[i]=arr[arr[i]];
        return res;
    }
    static void printArray(int[] arr){
        System.out.println("");
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(+arr[i]+",");
        }
        System.out.print(+arr[arr.length-1]+"]");
    }
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        printArray(arr);
        printArray(getArrayFromPermutation(arr));

        int[] arr2 = {4,5,0,1,2,3};
        printArray(arr2);
        printArray(getArrayFromPermutation(arr2));


        int[] arr3 = {0,2,1,5,3,4};
        printArray(arr3);
        printArray(getArrayFromPermutation(arr3));

        int[] arr4 = {0,1,2,4,5,3};
        printArray(arr4);
        printArray(getArrayFromPermutation(arr4));

    }
}
