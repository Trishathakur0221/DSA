package Array;

//left rotate the array by d places
public class A18 {
    public static void main(String[] args) {
        int d=3;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        //create the temporary element to store the array
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        //shifting the element
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        //printing the stored element at the last
        for(int i=0; i<d; i++){
            arr[n-d+i]=temp[i];
        }
        //printing the new array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
