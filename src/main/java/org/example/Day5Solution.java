package org.example;

import java.util.function.Function;

//        Good morning! Here's your coding interview problem for today.
//
//        This problem was asked by Jane Street.
//
//        cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
//
//        Given this implementation of cons:
//
//        def cons(a, b):
//        def pair(f):
//        return f(a, b)
//        return pair
//        Implement car and cdr.
public class Day5Solution {
    public static void main(String[] args) {
        System.out.println(car(cons(1,2)));
        System.out.println(cdr(cons(1,2)));
    }

    private static Function<Function<Pair,Integer>,Integer> cons(int a,int b){
        return func -> func.apply(new Pair(a,b));
    }
    private static int car(Function<Function<Pair,Integer>,Integer> cons){
        return cons.apply(pair -> pair.a);
    }
    private static int cdr(Function<Function<Pair,Integer>,Integer> cons){
        return cons.apply(pair1 -> pair1.b);
    }
}
class Pair{
    int a;
    int b;
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}
