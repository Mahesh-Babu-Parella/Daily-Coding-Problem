package org.example;

import java.util.Stack;

/*
This problem was asked by Facebook.

Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string "([])[]({})", you should return true.

Given the string "([)]" or "((()", you should return false.
 */
public class Day27Solution {
    public static void main(String[] args) {
        String str = "([])[]({})";
        System.out.println("BalancedBrackets : "+ balancedBrackets(str));
    }
    private static boolean balancedBrackets(String str){
        Stack<Character> stack = new Stack<>();
        for (char brace:str.toCharArray()){
            if(brace=='{'|| brace=='['|| brace=='('){
                stack.push(brace);
            }else if(stack.size()==0){
                return false;
            }else{
                char pop = stack.pop();
                if(brace=='}'&&pop=='{'){
                    continue;
                }else if(brace==')'&& pop=='('){
                    continue;
                }else if(brace==']'&& pop=='[') {
                    continue;
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
