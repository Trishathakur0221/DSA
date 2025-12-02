package Pattern;
// print this pattern using stars
/*  *
    *  *
    *  *  *
    *  *  *  *
    *  *  *
    *  *
    *   
*/
public class P43 {
    public static void main(String[] args) {
        // upper part
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower part
        for (int i=1; i<=4; i++) {
            for (int j=4; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
