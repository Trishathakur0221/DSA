//insert a node at the beginning of the doubly linked list
;

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

public class L22 {
    public static void main(String[] args) {

        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);

        // insert at beginning
        node temp = new node(50);

        temp.next = head;
        temp.prev = null;
        head.prev = temp;
        head = temp;

        System.out.println("Elements in the linked list:");

        node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}