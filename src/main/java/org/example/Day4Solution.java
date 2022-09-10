package org.example;

import java.util.Arrays;
import java.util.Scanner;
/*
This problem was asked by Stripe.
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
You can modify the input array in-place.
 */

public class Day4Solution {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("Missing positive Number : "+missingPositiveNum(arr));
        int[] arr1 = {1, 2, 0};
        System.out.println("Missing positive Number : "+missingPositiveNum(arr1));
    }
    private static int missingPositiveNum(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0){
                continue;
            }else if(i!=arr.length-1 && arr[i]+1!=arr[i+1]){
                return arr[i]+1;
            }
        }
        return arr[arr.length-1]+1;
    }
}
