package Array;

import java.util.*;
public class A24 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 5, 7, 8, 9 };
        int arr2[] = { 2, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> result = intersection(arr1, arr2);
        System.out.println("The intersection of two arrays is: " + result);
    }

    public static List<Integer> intersection(int[] a, int[] b) {
        int i = 0, j = 0;
        List<Integer> res = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                res.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return res;
    }

}
