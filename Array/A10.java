package Array;

import java.util.Arrays;

//check the array is sorted or not
public class A10 {
    public static void main(String[] args) {
        int arr[] = { 7, 2, 31, 9, 11, 22 };
        // Arrays.sort(arr);
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                   temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
