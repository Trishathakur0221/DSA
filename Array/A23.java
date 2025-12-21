package Array;
//find the union of two sorted array
public class A23 {
    public static void main(String[] args) {
        int arr1[]={1,2,5,7,9};
        int arr2[]={2,4,6,8,10};
        int i=0,j=0;
        System.out.println("the union of two array is: ");
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if(arr2[j]<arr1[i]){
                System.out.print(arr2[j] + " ");
                j++;
            }
            else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            System.out.print(arr1[i] + " ");
            i++;
        }
        while(j<arr2.length){
            System.out.print(arr2[j] + " ");
            j++;
        }
    }
}