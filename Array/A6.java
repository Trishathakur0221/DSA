package Array;

//find the smallest element in an array
public class A6 {
    public static void main(String[] args) {
        int arr[] = { 21, 54, 67, 98, 52, 14 };
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
