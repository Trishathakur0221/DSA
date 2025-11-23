package Pattern;
//print rectangle using alphabets
public class P18 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            char ch='A';
            for(int j=1;j<=5;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
