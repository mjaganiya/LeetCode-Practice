package leetcode;

import java.util.PriorityQueue;


/**
 * 747. Largest Number At Least Twice of Others
 *
 * You are given an integer array nums where the largest integer is unique.
 *
 * Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.
 *
 * Example 1:
 *
 * Input: nums = [3,6,1,0]
 * Output: 1
 * Explanation: 6 is the largest integer.
 * For every other number in the array x, 6 is at least twice as big as x.
 * The index of value 6 is 1, so we return 1.
 *
 */
public class Que747 {
    public static void main(String[] args) {
        int[] arr = {3,6,1,0};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = null;
        int[] arr4 = {1};
        System.out.println(dominantIndex(arr));
        System.out.println(dominantIndex(arr2));
        System.out.println(dominantIndex(arr3));
        System.out.println(dominantIndex(arr4));

        System.out.println(dominantIndex2(arr));
        System.out.println(dominantIndex2(arr2));
        System.out.println(dominantIndex2(arr3));
        System.out.println(dominantIndex2(arr4));
    }

    /**
     *
     * n
     */
    static int dominantIndex(int[] arr) {
        if(arr==null) return -1;
        int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE, ii=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=a){
                b=a;
                a=arr[i];
                ii=i;
            }else if(arr[i]>b){
                b=arr[i];
            }
        }
        return a>=2*b?ii:-1;
    }

    /**
     *
     * n(logn)
     */
    static int dominantIndex2(int arr[]){
        if(arr==null) return -1;
        if(arr.length==1) return 0;
        PriorityQueue<Integer> que = new PriorityQueue<>((a,b)->arr[b]-arr[a]);
        for(int i=0;i<arr.length;i++){
            que.add(i);
        }
        int a = que.poll(), b=que.poll();
        return a>=b*2?a:-1;
    }
}
