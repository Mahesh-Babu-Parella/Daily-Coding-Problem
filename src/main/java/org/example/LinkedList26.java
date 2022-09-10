package org.example;

public class LinkedList26 {
    Node head;
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val= val;
            this.next = null;
        }
    }

    public static void main(String[] args){
        LinkedList26 linkedList26 = new LinkedList26();
        linkedList26.head = new Node(1);
        Node second = new Node(2);
        linkedList26.head.next = second;
        Node third = new Node(3);
        second.next =third;
        linkedList26.print();
        linkedList26.removeKthElementFromLinkedList(2);
        linkedList26.print();
    }

    private void removeKthElementFromLinkedList(int k){
        Node slowNode= head;
        Node fastNode= head;
        while(k!=0){
            fastNode = fastNode.next;
            k--;
        }
        Node preNode = head;
        while(fastNode!=null){
            preNode = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }

        preNode.next = slowNode.next;

    }

    void print(){
        Node inHead=head;
        while(inHead!=null){
            System.out.print(inHead.val+"->");
            inHead = inHead.next;
        }
        System.out.println();
    }

}
