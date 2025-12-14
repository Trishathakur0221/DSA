package Array;
import java.util.*;
// left rotate the array by one
public class A16 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of array: ");
       int n=sc.nextInt();
       int[] arr=new int[n];
       System.out.println("enter the elements of array: ");
       for (int i = 0; i < n; i++) {
           arr[i]=sc.nextInt();
       }
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
