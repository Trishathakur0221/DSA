//remove duplicates in a sorted linkedlist
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
public class L32 {
    public static void main(String[] args) {
        node head= new node(10);
        head.next=new node(20);
        head.next.next=new node(20);
        head.next.next.next=new node(30);
        head.next.next.next.next=new node(40);
        head.next.next.next.next.next=new node(40);
        head.next.next.next.next.next.next=new node(50);

        //remove duplicates in a sorted linkedlist
        node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        System.out.println("the linkedlist after removing the duplicates:");
        //traversal
        node t=head;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
    }
}
