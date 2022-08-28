package org.example;

public class Day7Solution {
    public static void main(String[] args) {
        String s= "102";
        System.out.println(possibleEncodes(s,s.length()));
    }
    private static int possibleEncodes(String s,int len) {
        if(s.charAt(0)=='0'){
            return 0;
        }
        if(len == 0 || len ==1){
            return 1;
        }
        int sum = 0;
        if(s.charAt(len-1)>='1' && s.charAt(len-1)<='9'){
            sum+=possibleEncodes(s,len-1);
        }
        if(s.charAt(len-2) =='1' || s.charAt(len-2)=='2' && s.charAt(len-1)<='6'){
            sum+=possibleEncodes(s,len-2);
        }
        return sum;
    }
}
