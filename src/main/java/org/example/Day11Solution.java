package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day11Solution {
    public static void main(String[] args) {
        String[] arr = {"dear","deal","dog"};
        String start = "de";
        System.out.println(startsWithSubString(arr,start));
    }
    private static List<String> startsWithSubString(String[] arr,String start){
        List<String > list = new ArrayList<>();
        for(String s:arr){
            if(s.startsWith(start)){
                list.add(s);
            }
        }
        return list;
    }
}
