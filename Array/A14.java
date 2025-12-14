package Array;
//count even or odd in an array
public class A14 {
    public static void main(String[] args) {
       int arr[]={1,2,3,6,4,8,9};
       for(int i=0;i<arr.length;i++) {
           if(arr[i]%2==0){
            System.out.println("even");
           }
           else{
            System.out.println("odd");
           }
       }
    }
}
