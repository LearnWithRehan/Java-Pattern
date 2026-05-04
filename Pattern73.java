import java.util.Scanner;

public class Pattern73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows:- ");
        int rows = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i<=rows; i++){
            //spaces
            for (int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(ch + " ");
                ch--;
            }
            ch = (char) ((int)'A' + i);
            System.out.println();
        }
        sc.close();
    }
}
