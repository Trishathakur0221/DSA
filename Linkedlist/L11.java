//delete the last node of the sll
package Linkedlist;
class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;
    }
}   
public class L11 {
    public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.next.next.next.next=new node(50);

        //delete the last node
        node temp=head;
        node t=null;
        while(temp.next!=null){
        t=temp;
        temp=temp.next;
        }
        t.next=null;
        System.out.println("elements in the last node after deleting the last node");
        node p=head;
        while(p!=null){
            System.out.println(p.data);
            p=p.next;
        }
    }
}
