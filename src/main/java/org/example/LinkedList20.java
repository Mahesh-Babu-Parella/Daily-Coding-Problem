package org.example;

public class LinkedList20 {
    public static void main(String[] args) {
        Node node111 = new Node(10,null);
        Node node11 = new Node(8,node111);
        Node node1 = new Node(7,node11);
        Node head1  = new Node(3,node1);
        Node node2 = new Node(1,node11);
        Node head2 = new Node(99,node2);
        System.out.println(intersection(head1,head2));
    }

    private static int length(Node head){
        int count=0;
        while(head != null){
            head=head.next;
            count++;
        }
        return count;
    }

    private static int intersection(Node head1,Node head2){
        int head1Length = length(head1);
        int head2Length = length(head2);
        Node head11 = head1;
        Node head22 = head2;
        if (head1Length > head2Length){
            for(int i = head1Length-head2Length;i>0;i--){
                head11 = head11.next;
            }
        }else{
            for(int i = head2Length-head1Length;i>0;i--){
                head22 = head22.next;
            }
        }
        while(head11!=head22){
            head11=head11.next;
            head22=head22.next;
        }
        return head22.val;
    }
    private static class Node{
        int val;
        Node next;
        Node(int val,Node node){
            this.val = val;
            this.next = node;
        }
    }
}
