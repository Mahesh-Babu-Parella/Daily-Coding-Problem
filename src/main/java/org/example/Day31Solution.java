package org.example;
/*
This problem was asked by Google.

The edit distance between two strings refers to the minimum number of character insertions, deletions, and substitutions required to change one string to the other. For example, the edit distance between “kitten” and “sitting” is three: substitute the “k” for “s”, substitute the “e” for “i”, and append a “g”.

Given two strings, compute the edit distance between them.
 */
public class Day31Solution {
    public static void main(String[] args) {
        String s1 = "kitten";
        String s2 = "sitting";
        System.out.println("min num of string compared:"+minNumOfStringCom(s1,s2));
    }
    private static int minNumOfStringCom(String s1,String s2){
        int len = Math.abs(s1.length()-s2.length());
        if(s1.length()>s2.length()){
            String s = s1;
            s1 = s2;
            s2 = s;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                len++;
            }
        }
        return len;
    }
}
