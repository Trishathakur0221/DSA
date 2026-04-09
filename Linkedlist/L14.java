//dalete a node before a given data
//package Linkedlist;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L14 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);

        // delete the node before a given data
        int x=40;
        node t = null;
        node temp = head;
        node next = head.next;

        while (temp != null && temp.next != null && temp.next.data != x) {
            temp = temp.next;
        }

        if (temp != null && temp.next != null) {
            temp.next = temp.next.next; // delete the node before x
        }

        // print the list
        node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
