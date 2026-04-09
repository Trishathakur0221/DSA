//insert a node after a given position in a singly linked list
//package Linkedlist;
class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class L6 {
    public static void main(String[] args) {
      node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);
        
        // Insert a new node after a given position
        node p=new node(90);
        node temp=head;
        node t=null;
        int x=30; //position after we want to insert the new node
        while(temp.data!=x){
            t=temp;
            temp=temp.next;
        }
        t.next=p;
        p.next=temp;
        System.out.println("Elements in the linked list after insertion at a given position:");
        node q=head;
        while(q!=null){
            System.out.println(q.data);
            q=q.next;
        }
    }
}
