package Array;
import java.util.*;
public class A3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
         System.out.println("enter the size of array: ");
        int size=sc.nextInt();
        int num[]=new int [size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
            System.out.println("enter the array elements:");
        }
        for(int i=0;i<size;i++){
            System.out.println("the number will be: "+ num[i]);
        }
    }
}
