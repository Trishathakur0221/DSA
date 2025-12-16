package Array;
// move all zeros to the end of the array
public class A21 {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        int n=arr.length;
        int index=0;
        
        // Move all non-zero elements to the front
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        
        // Fill remaining positions with zeros
        while(index<n){
            arr[index]=0;
            index++;
        }
        
        // Print the array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
