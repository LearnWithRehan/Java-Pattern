import java.util.Scanner;

public class Pattern76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows:-");
        int rows = sc.nextInt();
        char ch;
        for (int i = rows; i>=1; i--){
            ch = 'A';
            //spaces
            for (int j = 2*rows-i; j>i; j--){
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        //half
        for (int i = 2; i<=rows; i++){
            //same as uper code
            ch = 'A';
            //spaces
            for (int j = 2*rows-i; j>i; j--){
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();

        }



        sc.close();
    }
}
