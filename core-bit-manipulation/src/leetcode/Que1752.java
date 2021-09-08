package leetcode;
/**
 *
 * 1752. Check if Array Is Sorted and Rotated
 *
 * Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
 *
 * There may be duplicates in the original array.
 *
 * Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.
 *
 *
 *
 Example 1:

 Input: nums = [3,4,5,1,2]
 Output: true
 Explanation: [1,2,3,4,5] is the original sorted array.
 You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].

 */
public class Que1752 {


    private static boolean check(int[] nums) {
        //3,4,5,1,2
        int dic = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                dic++;
                if(dic==2) return false;
            }
        }
        if(dic == 1 && nums[0] < nums[nums.length-1]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(check(arr));
    }
}
