package Pattern;

public class P47 {
    public static void main(String[] args) {
        int n = 6; // size

        for (int i = n / 2; i <= n; i += 2) {
            // leading spaces
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }

            // left upper part
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // middle spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // right upper part
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // lower part
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                if (j == 1 || j == (i * 2) - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
