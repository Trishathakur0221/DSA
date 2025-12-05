package Pattern;

//print the hollow butterfly using stars 
public class P46 {
    public static void main(String[] args) {
        int n = 10;

        // Upper part
        for (int i = 1; i <= n; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Spaces between wings
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Lower part
        for (int i = n; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Spaces between wings
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
