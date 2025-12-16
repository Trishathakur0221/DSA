package Array;
//right rotate the array by one
public class A19 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int d=1;
        // reverse entire array
        reverse(arr, 0, n - 1);
        // reverse first d elements
        reverse(arr, 0, d - 1);
        // reverse remaining elements
        reverse(arr, d, n - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
