package Pattern;
// print the reverse of pattern P43 using stars
public class P44 {
    public static void main(String[] args) {
        // upper part
         for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower part
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=5;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
