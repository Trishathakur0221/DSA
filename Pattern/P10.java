package Pattern;

//print the diamond pattern
public class P10 {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        // for(int j=5;j>=i;j--){
        // System.out.print(" ");
        // }
        // for(int k=1;k<=i;k++){
        // System.out.print("*");
        // }
        // for(int l=2;l<=i;l++){
        // System.out.print("*");
        // }
        // for(int m=1;m<=i;m++){
        // System.out.print(" ");
        // }
        // for(int n=2;n>=i;n--){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // upper part
        for (int i = 0; i <= 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        for (int i = 2; i >= 0; i--) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
