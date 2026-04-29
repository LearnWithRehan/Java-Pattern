import java.util.Scanner;

public class Pattern65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows:- ");
        int rows = sc.nextInt();
        for (int i = 1; i<=rows; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j= 1; j<= 2*(rows-i); j++){
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = rows-1; i>=1; i--){

            //paste here

            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j= 1; j<= 2*(rows-i); j++){
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }


        sc.close();
    }
}
