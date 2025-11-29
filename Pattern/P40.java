package Pattern;
// hollow diamond pattern
public class P40 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(k==1 || k==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=7;k>=2*i-1;k--){
                if(k==7 || k==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
