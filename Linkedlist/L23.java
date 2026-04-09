//insert a node at the end of doubly linked list


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

public class L23 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);

        // insert a new node at the end
        node p=new node(50);
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=p;
        p.prev=temp;
        p.next=null;

        //traversal
        node t=head;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
    }
}
