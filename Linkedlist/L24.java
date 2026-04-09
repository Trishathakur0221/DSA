//insert a node after a given data in a doubly linked list
//package Linkedlist;
class node {
    int data;
    node next;
    node prev;

    node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class L24 {
    public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.next.next.next.next=new node(50);

        //insert a new node after a given data

        node p=new node(60);
        node temp=head;
        int x=30; //data after which we want to insert the new node
        //node t=null;
        while(temp.data!=x){
            //t=temp;
            temp=temp.next;
        }
        //t.next=p;
        p.prev=temp;
        p.next=temp.next;
        temp.next.prev=p;
        temp.next=p;
        System.out.println("Elements in the linked list after insertion after a given data:");

        //traversal
        node q=head;
        while(q!=null){
            System.out.print(q.data+" ");
            q=q.next;
        }
    }
}
