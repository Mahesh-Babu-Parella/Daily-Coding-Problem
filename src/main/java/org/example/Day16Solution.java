package org.example;

import java.util.ArrayList;
import java.util.List;

public class Day16Solution {
    public static void main(String[] args) {
        Log log = new Log(3);
        log.record(1);
        System.out.println(log.getLast(2));
        log.record(2);
        System.out.println(log.getLast(2));
        log.record(3);
        System.out.println(log.getLast(2));
    }

    static class Log{
        int size;
        List<Integer> log = new ArrayList<>();
        Log(int size){
            this.size=size;
        }
        void record(int orderId) {
            if (log.size() >= size) {
                log.remove(0);
            }
            log.add(orderId);
        }
        int getLast(int orderIdfromLast){
            if(log.size()>=orderIdfromLast) {
                return log.get(size - orderIdfromLast);
            }else{
                return -1;
            }
        }
    }
}
