import java.util.Scanner;

public class Pattern61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows:- ");
        int rows = sc.nextInt();
        for (int i = 1; i<=rows; i++){
            //spaces
            for (int j = 2*rows-i; j>i; j--){
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--){
                if (j == 1 || j==i || i == rows){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
