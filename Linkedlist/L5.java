// 5.insert a node before a last node
//package Linkedlist;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class L5 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);

        // add a node before a last node
        node p=new node(90);
        node temp=head; //temp is used to store the last node whose next is null
        node t = null; //initialize t to null, t is used to store the last second node
        while(temp.next!=null){
            t = temp; //t is the last second node
            temp=temp.next;
        }
        t.next=p;
        p.next=temp;
        System.out.println("Elements in the linked list after insertion before the last node:");
        node q=head;
        while(q!=null){
            System.out.println(q.data);
            q=q.next;
        }
    }
}
