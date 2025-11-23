package Pattern;
//print right angle triangle using alphabets at right hand side
public class P17 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            // char ch=(char)('A' + i - 1);
           
            for(int j=5;j>=i;j--){
                System.out.print("  ");
            }
             char ch='A';
            for(int k=1;k<=i;k++){
                System.out.print(ch + "");
                ch++;
            }
            System.out.println();
        }
    }
}
