//delete a node at a given position
package Linkedlist;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L15 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);

        // delete the node at a given position
        int x = 30;
        node temp = head;
        node t = null;
        while (temp.data != x && temp != null) {
            t = temp;
            temp = temp.next;
        }
        if(temp != null) {
            if(t==null) {
                head = head.next; // if the node to delete is the head
            } else {
                t.next = temp.next; // delete the node at position x
            }
        }
        System.out.println("elements in the linked list after deleting the node at a given position");
        node p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }
}
