//swapping of last sec and last node in singly linked list
package Linkedlist;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L17 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);

        // swapping of last sec and last node
        node temp = head;
        node prev = null;
        
        while (temp.next.next != null) {
            prev = temp;
            temp = temp.next;
        }
        node last = temp.next;
        prev.next = last;
        last.next = temp;
        temp.next = null;
        System.out.println("after the swapping of last sec and last node");
        node q = head;
        while (q != null) {
            System.out.println(q.data);
            q = q.next;
        }
    }
}