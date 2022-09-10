package org.example;

import javax.swing.*;
import java.util.Map;
import java.util.TreeMap;

public class Day21Solution {
    public static void main(String[] args) {
        Interval[] intervals = new Interval[]{new Interval(30,75),new Interval(0,50),new Interval(60,150)};
        int minOverlapping = minNoOfOverlapping(intervals);
        System.out.println(minOverlapping);
    }

    static class Interval{
        int start;
        int end;
        Interval(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
    private static int minNoOfOverlapping(Interval[] intervals){
        int res = 0;
        int count = 0;
        Map<Integer,Integer> treeMap = new TreeMap<>();
        for(Interval interval: intervals){
            treeMap.put(interval.start, treeMap.getOrDefault(interval.start,0)+1);
            treeMap.put(interval.end,treeMap.getOrDefault(interval.end,0)-1);
        }
        for(int val:treeMap.values()){
            res = Math.max(res,count+=val);
        }
        return res;
    }

}
