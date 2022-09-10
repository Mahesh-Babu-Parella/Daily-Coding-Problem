package org.example;

import java.util.Arrays;
/*
        Good morning! Here's your coding interview problem for today.

        This problem was asked by Uber.

        Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

        For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

        Follow-up: what if you can't use division?
 */
public class Day2Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(productAllExceptINdexNum(arr)));
        int[] arr1 = {3,2,1};
        System.out.println(Arrays.toString(productAllExceptINdexNum(arr1)));
    }

    public static int[] productAllExceptINdexNum(int arr[]){
        int[] result = new int[arr.length];
        if(arr.length==1){
            return arr;
        }
        int countZeroes = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZeroes++;
            }
        }
        if(countZeroes ==2){
            return result;
        }
        for(int i=0;i<arr.length;i++){
            int internalPro = 1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                   internalPro*=arr[j];
                }
            }
            result[i]=internalPro;
        }
        return result;
    }
}
