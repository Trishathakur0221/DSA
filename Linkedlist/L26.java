//delete the first node in doubly linkedlist 
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

public class L26 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);

        //delete a first node 
        node temp=head;
        head=head.next;
        head.prev=null;

        //traversal
        node p=head;
        while(p!=null){
            System.out.println(p.data);
            p=p.next;
        }
    }
}
