//insert a node before a given data in a singly linked list
//package Linkedlist;

public class L8 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);
        // Insert a new node before a given data
        node p = new node(90);
        node temp = head;
        node t = null;
        int x = 40; // data before which we want to insert the new node
        while (temp.data != x) {
            t = temp;
            temp = temp.next;
        }
        t.next = p;
        p.next = temp;
        System.out.println("Elements in the linked list after insertion before a given data:");
        node q = head;
        while (q != null) {
            System.out.print(q.data + " ");
            q = q.next;
        }

    }
}
