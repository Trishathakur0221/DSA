//remove the nth node from the end of the list 
class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class L29 {
    public static void main(String[] args) {
       node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);
        
        int n=2;
        node fast=head;
        node slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        node delnode=slow.next;
        slow.next=slow.next.next;
        delnode.next=null;
        System.out.println("the linked list after removing the nth node from the end is: ");
        node p=head;
        while(p!=null){
            System.out.println(p.data);
            p=p.next;
        }
    }
}
