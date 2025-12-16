package Array;
//right rotate the array by one
public class A19 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        //storing the element
        int temp=arr[n-1];  //temp=8
        //shifting the element
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        //place the stored element
        arr[0]=temp;
        //print the array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
