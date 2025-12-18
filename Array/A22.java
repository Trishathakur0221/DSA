package Array;

public class A22 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum=sum+arr1[i];
        }
        System.out.println(sum);
        int sum1=0;
        int arr2[]={6,7,8,9,10};
        for(int i=0;i<arr2.length;i++){
            sum1=sum1+arr2[i];
        }
        System.out.println(sum1);
        int result=sum+sum1;
        System.out.println(result);
    }
}
