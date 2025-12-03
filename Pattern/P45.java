package Pattern;

// print the butterfly pattern using stars
/*
   *           *
   * *       * *
   * * *   * * *
   * * * * * * *
   * * *   * * *
   * *       * *
   *           *
*/
public class P45 {
    public static void main(String[] args) {
        // upper part of left wing
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower part of left wing
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // upper part of right wing
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower part of right wing
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
