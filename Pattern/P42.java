package Pattern;

//hollow pyramid pattern using alphabet
public class P42 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            ch++;
        }
    }
}
