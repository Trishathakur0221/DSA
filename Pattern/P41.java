package Pattern;
// full diamond pattern using alphabet
public class P41 {
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=5;i++) {
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
        ch='D';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=7;k>=2*i-1;k--){
                System.out.print(ch);
            }
            System.out.println();
            ch--;
        }
    }
}
