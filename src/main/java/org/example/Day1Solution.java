package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
        Good morning! Here's your coding interview problem for today.

        This problem was recently asked by Google.

        Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

        For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

        Bonus: Can you do this in one pass?

 */
public class Day1Solution {
    public static void main(String[] args) {
        int[] arr = {10,15,3,7};
        int target = 17;
        System.out.println(sumTarget(arr,target));
        target = 21;
        System.out.println(sumTarget(arr,target));
    }

    public static boolean sumTarget(int[] arr,int target){
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            if(set.contains(target - num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
