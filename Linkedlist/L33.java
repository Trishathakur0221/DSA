//remove duplicates from the unsorted linkedlist
class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L33 {
    public static void main(String[] args) {
        node head = new node(40);
        head.next = new node(20);
        head.next.next = new node(20);
        head.next.next.next = new node(10);
        head.next.next.next.next = new node(30);
        head.next.next.next.next.next = new node(50);

        // sort the linkedlist first
        node temp = head;
        while (temp != null) {
            node t = temp.next;
            while (t != null) {
                if (temp.data > t.data) {
                    int x = temp.data;
                    temp.data = t.data;
                    t.data = x;
                }
                t = t.next;
            }
            temp = temp.next;
        }
        // remove duplicates in a sorted linkedlist
        temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        System.out.println("the linkedlist after removing the duplicates:");
        // traversal
        node t = head;
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }
}
