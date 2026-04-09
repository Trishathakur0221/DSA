//insert node before a given data in a doubly linked list
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
public class L25 {
    public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.next.next.next.next=new node(50);
        
        //insert a node before a given data
        node p=new node(60);
        int x=30;
        node temp=head;
        node t=null;
        while(temp.data!=x){
            t=temp;
            temp=temp.next;
        }
        t.next=p;
        p.prev=t;
        p.next=temp;
        temp.prev=p;
        System.out.println("Elements in the linked list before insertion after a given data:");

        //traversal
        node q=head;
        while(q!=null){
            System.out.println(q.data);
            q=q.next;
        }
    }
}