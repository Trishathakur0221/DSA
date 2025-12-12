package Array;
//find the largest element in an array
public class A5{
   public static void main(String[] args) {
    int arr[]={32,56,13,86,35,879};
    int largest=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
    System.out.println(largest);
   }
}