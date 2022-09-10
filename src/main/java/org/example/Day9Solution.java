package org.example;

import java.sql.SQLOutput;

/*
This problem was asked by Airbnb.
Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.
For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
Follow-up: Can you do this in O(N) time and constant space?
 */
public class Day9Solution {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 2, 5};
        System.out.println("Max sum of non adjacent numbers : "+maxSumOfNonAdjacentNum(arr));
        int[] arr1 = {5,1,1,5};
        System.out.println("Max sum of non adjacent numbers : "+maxSumOfNonAdjacentNum(arr1));
    }
    private static int maxSumOfNonAdjacentNum(int[] arr){
        if(arr.length==0){
            return 0;
        }
        if(arr.length==1){
            return arr[0];
        }
        if(arr.length==2){
            return Math.max(arr[0],arr[1]);
        }
        int[] cache = new int[arr.length];
        cache[0] = arr[0];
        cache[1] = Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            cache[i] = Math.max(cache[i-1],cache[i-2]+arr[i]);
        }
        return cache[arr.length-1];
    }
}
