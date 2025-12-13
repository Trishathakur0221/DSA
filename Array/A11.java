package Array;

//remove duplicates from the array
public class A11 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 17, 8, 9 };
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                isSorted = false;
            }
        }
        System.out.println(isSorted);
    }
}
