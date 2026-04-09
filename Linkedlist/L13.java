//delete a node after a given data
//package Linkedlist;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L13 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);

        // delete the node after a given data
        int x = 30;
        node temp = head;
        while (temp != null) { //this is for checking the last node if it is null or not
            if (temp.data == x) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            System.out.println("elements in the linked list after deleting the node after a given data: ");
        }
        node p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }
}
