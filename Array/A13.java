package Array;
//sum of all array elements 
public class A13 {
    public static void main(String[] args) {
        int arr[]={2,3,5,1,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
