//odd even linked list
class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class L31{
    public static void main(String[] args) {
        node head= new node(1);
        head.next=new node(2);
        head.next.next=new node(3);
        head.next.next.next=new node(4);
        head.next.next.next.next=new node(5);
        head.next.next.next.next.next=new node(6);
        head.next.next.next.next.next.next=new node(7);
        head.next.next.next.next.next.next.next=new node(8);
        node odd=head;
        node even=head.next;
        node evenhead=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        System.out.println("the linked list after rearranging is: ");
        //traversal
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}