import java.util.Scanner;

public class Pattern51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows:- ");
        int rows = sc.nextInt();
        for (int i = rows; i>=1; i--){
            for (int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            //printing i stars at the end of each row
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //printing lower half of the pattern
        for (int i = 2; i<=rows; i++){
            for (int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }



        sc.close();
    }
}
