package org.example;

public class Day20Solution {
    public static void main(String[] args) {
        Node node = new Node(10,null);
    }

    private  static class Node{
        int val;
        Node next;
        Node(int val){
            this.val =val;
            this.next = null;
        }
        Node(int val,Node next){
            this.val =val;
            this.next = next;
        }
    }
}
