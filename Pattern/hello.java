package Pattern;
// print hello using stars

//  *     *   * * * *   *        *        * * * *
//  *     *   *         *        *        *     *
//  *  *  *   * * * *   *        *        *     *
//  *     *   *         *        *        *     *
//  *     *   * * * *   * * * *  * * * *  * * * *

public class hello {
    public static void main(String[] args) {
        //printing H
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5|| i==3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //printing E
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1|| i==5|| j==1|| i==3){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
