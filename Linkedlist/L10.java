//delete the first node in singly linked list
//package Linkedlist;
class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class L10 {
    public static void main(String[] args) {
        node head= new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.next.next.next.next=new node(50);

        //delete the first node
        node temp=head; //here we are copying the reference of head to temp so that we can use temp to traverse the linked list and head will be used to point to the new head of the linked list after deletion
        head=head.next;
        temp.next=null;
        System.out.println("Elements in the linked list after deleting the first node:");
        node t=head;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
    }
}
