package Pattern;

public class P48 {
    public static void main(String[] args) {
        for (int row = 1; row <= 7; row++) {

            // ---------------- T ----------------
            for (int col = 1; col <= 9; col++) {
                if (row == 1) System.out.print("*");
                else if (col == 5) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // ---------------- R ----------------
            for (int col = 1; col <= 7; col++) {
                if (col == 1 || (row <= 3 && col == 7) || row == 1 ||
                    (row == 4 && col <= 6) || (row >= 5 && col == row - 3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("   ");

            // ---------------- I ----------------
            for (int col = 1; col <= 7; col++) {
                if (row == 1 || row == 7 || col == 4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("   ");

            // ---------------- S ----------------
            for (int col = 1; col <= 7; col++) {
                if (row == 1 || row == 4 || row == 7 ||
                    (row < 4 && col == 1) ||
                    (row > 4 && col == 7))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("   ");

            // ---------------- H ----------------
            for (int col = 1; col <= 7; col++) {
                if (col == 1 || col == 7 || row == 4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("   ");

            // ---------------- A ----------------
            for (int col = 1; col <= 7; col++) {
                if ((row == 1 && col == 4) ||                    // top
                    (row == 2 && (col == 3 || col == 5)) ||
                    (row == 3 && (col == 2 || col == 6)) ||
                    (row == 4) ||                                // middle bar
                    (row > 4 && (col == 1 || col == 7)))         // legs
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}