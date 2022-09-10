package org.example;
/*
This problem was asked by Amazon.
There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.
For example, if N is 4, then there are 5 unique ways:
1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2
What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.

 */
public class Day12Solution {
    public static void main(String[] args) {
        int stair = 4;
        int[] steps = {1,3,5};
        System.out.println("No of ways to climb stairs : "+waysToClimbStairs(stair,steps));
    }
    private static int waysToClimbStairs(int stair,int[] steps){
        if(stair==0){
            return 1;
        }else if(stair<1){
            return 0;
        }else{
            int sum=0;
            for(int step:steps){
                sum+=waysToClimbStairs(stair-step,steps);
            }
            return sum;
        }
    }
}
