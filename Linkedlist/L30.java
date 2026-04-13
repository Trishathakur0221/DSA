import java.util.Stack;

//check if linked list is palindrome or not
class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class L30 {
    public static void main(String[] args) {
        node head= new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(20);
        head.next.next.next.next=new node(10);

        //check if linked list is palindrome or not
        Stack<Integer> s=new Stack<>();
        node temp=head;
        while(temp!=null){
            s.push(temp.data);
            temp=temp.next;
        }
        boolean isPalindrome=true;
        temp=head;
        while(temp!=null){
            if(temp.data!=s.pop()){
                isPalindrome=false;
                break;
            }
            temp=temp.next;
        }
        if(isPalindrome){
            System.out.println("Linked list is palindrome");
        }else{
            System.out.println("Linked list is not palindrome");
        }
        node p=head;
        while(p!=null){
            System.out.print(p.data + " ");
            p=p.next;
        }
    }
}
