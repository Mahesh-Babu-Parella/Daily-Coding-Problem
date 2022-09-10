package org.example;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

public class Day22Solution {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("bed");
        stringList.add("bath");
        stringList.add("bedbath");
        stringList.add("and");
        stringList.add("beyond");
        String word = "bedbathandbeyond";
        System.out.println(reConstruction(stringList,word));
    }
    private static List<String> reConstruction(List<String> stringList,String word){
        List<String> list = new ArrayList<>();
        while(!word.isEmpty()){
            String internString = "";
            for(String s: stringList) {
                if(word.startsWith(s) && s.length() > internString.length()){
                    internString=s;
                }
            }
            list.add(internString);
            word = word.substring(internString.length());
            stringList.remove(internString);
        }
        return list;
    }
}
