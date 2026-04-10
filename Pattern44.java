import java.util.Scanner;

public class Pattern44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows:- ");
        int rows = sc.nextInt();
        //outer loop handles number of rows
        for (int i = 1; i<=rows; i++){
            //Printing rows-i spaces at the beginning of each row
            for (int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            //Printing i stars at the end of each row
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
