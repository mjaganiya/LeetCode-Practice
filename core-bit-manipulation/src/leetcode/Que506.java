package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 506. Relative Ranks
 *
 * You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.
 *
 * The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
 *
 * The 1st place athlete's rank is "Gold Medal".
 * The 2nd place athlete's rank is "Silver Medal".
 * The 3rd place athlete's rank is "Bronze Medal".
 * For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
 * Return an array answer of size n where answer[i] is the rank of the ith athlete.
 *
 *
 *
 * Example 1:
 *
 * Input: score = [5,4,3,2,1]
 * Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
 * Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
 *
 *
 */
public class Que506 {
    static String[] getResult(int[] score) {
        String[] res = new String[score.length];
        int[] score2 = Arrays.copyOf(score, score.length);
        score2 = sort(score2);
        res[0] = "Gold Medal";
        for(int i=1;i<score.length;i++){
            int p = score.length - findPlace(score2, score[i]);
            res[i] = p==2?"Silver Medal":p==3?"Bronze Medal":""+p+"";
        }
        return res;
    }

    static int findPlace(int[] arr, int find) {
        for(int i=0;i<arr.length;i++){
            if(find == arr[i]) return i;
        }
        return -1;
    }

    static int[] sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j = i-1, last = arr[i];
            while(j>=0 && arr[j]>last){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=last;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,3,8,9,4};
      Arrays.stream(findRelativeRanks(arr)).forEach(it -> System.out.print(" "+it));
    }


    public static String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] res = new String[n];

        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a,b)->score[b]-score[a]);

        for(int i=0;i<n;i++){
            pq.add(i);
        }
        System.out.println(pq);

        int i=1;
        while(!pq.isEmpty()){

            int idx = pq.poll();

            if(i>3){
                res[idx] = Integer.toString(i);
            }else if(i==1){
                res[idx] = "Gold Medal";
            }else if(i==2){
                res[idx] = "Silver Medal";
            }else if(i==3){
                res[idx] = "Bronze Medal";
            }
            i++;
        }

        return res;
    }
}
