package Array;
//find the second smallest element in an array
public class A8 {
    public static void main(String[] args) {
        int arr[]={12,23,97,49,24,16};
        int small=arr[0];
        int secsmall=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secsmall=small;
                small=arr[i];
            }
            else if(arr[i]<secsmall && arr[i]!=small ){
                secsmall=arr[i];
            }
        }
        System.out.println(small);
        System.out.println(secsmall);
    }
}
