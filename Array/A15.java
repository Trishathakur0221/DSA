package Array;
//search the element in an array or linear search
public class A15 {
    public static void main(String[] args) {
        int arr[]={1,3,2,6,4,8};
        int key=4;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("found at index: " + arr[i]);
            }
            else{
                System.out.println("not found at index: " + arr[i]);
            }
        }
    }
}
