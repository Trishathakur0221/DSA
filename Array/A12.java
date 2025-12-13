package Array;
//remove duplicates from the array
public class A12 {
    public static void main(String[] args) {
        int a[]={1,11,2,2,3};
        int count = 0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                a[count+1]=a[i+1];
                count++;
            }
        }
        for(int i=0;i<=count;i++){
            System.out.println(a[i]);
        }
    }
}
