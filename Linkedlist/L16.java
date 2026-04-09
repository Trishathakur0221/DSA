//swap first and last node of singly linked list
//package Linkedlist;
class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class L16 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);

        //swp first and last
        node temp=head;
        node t=null;
        node p=head.next;
        
        while(temp.next!=null){
          t=temp;
          temp=temp.next;
        }
        temp.next=p;
        t.next=head;
        head.next=null;
        //p=head.next;
        head=temp;
        System.out.println("after the swapping of first and last node");
        node q=head;
        while(q!=null){
            System.out.println(q.data);
            q=q.next;
        }
    }
}
