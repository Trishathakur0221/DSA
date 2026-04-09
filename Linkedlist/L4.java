//4. insert a node at the end of the linked list.
//package Linkedlist;
class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class L4 {
    public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.next.next.next.next=new node(50);

        // Insert a new node at the end
        node temp=new node(90);
        node p=head;
        while(p.next!=null){
            p=p.next; // Move to the last node
        }
        temp.next=null; // Set the new node's next to null
        p.next=temp; // Point the last node's next to the new node
        System.out.println("Elements in the linked list after insertion at the end:");
        node t=head;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
    }
}
