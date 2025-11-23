package Pattern;
//print the alphabets using stars
//       *
//      * *
//     * * *
//    *     *
//   *       *
// public class P19 {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=5;j<=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 if(k==1 || k==5){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

public class P19 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            // leading spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // stars and hollow part
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}