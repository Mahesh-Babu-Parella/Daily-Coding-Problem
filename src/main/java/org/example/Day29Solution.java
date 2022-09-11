package org.example;


/*
This problem was asked by Amazon.

Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

Implement run-length encoding and decoding. You can assume the string to be encoded have no digits and consists solely of alphabetic characters. You can assume the string to be decoded is valid.
 */
public class Day29Solution {
    public static void main(String[] args) {
        String str = "AAAABBBCCDAA";
        System.out.println(encodedString(str));
    }
    private static String encodedString(String str){
        String encodedString = "";
        char start = str.charAt(0);
        int count = 1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==start){
                count++;
            }else {
                encodedString+=Integer.toString(count)+start;
                start = str.charAt(i);
                count=1;
            }
        }
        return encodedString+count+start;
    }
}
