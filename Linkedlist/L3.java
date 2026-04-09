//insert a node at the beginning of a singly linked list
//package Linkedlist;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L3 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);

        // Insert a new node at the beginning
        node temp = new node(54);
        temp.next = head; // Point the new node's next to the current head
        head = temp;

        System.out.println("Elements in the linked list after insertion at the beginning:");
        node t = head;
        while (t != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
