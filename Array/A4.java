//suppose we have to find the target in the given array and firstly take the array from the user 
package Array;
import java .util.*;
public class A4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
         if(arr[i]==key){
            System.out.println("found");
         }
         else{
            System.out.println("not found");
         }
        }
    }
}
