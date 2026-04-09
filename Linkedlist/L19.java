//find the length of the linked list

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class L19 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);

        //length of the linkedlist
        int count=0;
        node temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("length of the linkedlist is:" + count);
        node p=head;
        while(p!=null){
            System.out.println(p.data);
            p=p.next;
        }
    }
}
