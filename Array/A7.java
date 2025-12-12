package Array;
//find the second largest element in an array
public class A7 {
    public static void main(String[] args) {
        int arr[]={12,34,46,22,37};
        int lar=arr[0];
        int slarge=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                slarge=lar;
                lar=arr[i];
            }
            else if(arr[i]<lar && arr[i]>slarge){
                slarge=arr[i];
            }
        }
        System.out.println(lar);
        System.out.println(slarge);
    }
}
