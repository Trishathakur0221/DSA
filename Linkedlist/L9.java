// search a data in singly linked list
//package Linkedlist;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L9 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);

        // search a data
        int x = 30;
        node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.data == x) {
                System.out.println(x);
                found = true;
                break;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println(" Element not found in the linked list");
        }
        node p=head;
        while(p!=null){
             System.out.print(p.data + " ");
            p = p.next;
        }
    }
}
