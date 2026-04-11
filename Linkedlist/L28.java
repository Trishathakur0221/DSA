//sum of all data in a linked list
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
public class L28 {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);

        //sum of all data 
        int sum=0;
        node temp=head;
        while(temp!=null){
            sum=sum+temp.data;
            temp=temp.next;
        }
        System.out.println("the sum of all elements in the linkedlist is: " + sum);

        //traversal
        node p=head;
        while(p!=null){
            System.out.println(p.data);
            p=p.next;
        }
    }
}
