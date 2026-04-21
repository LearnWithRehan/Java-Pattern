import java.util.Scanner;

public class Pattern54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows:- ");
        int rows = sc.nextInt();
        for (int i = 1; i<=rows; i++){
            for (int j = 1; j<=i; j++){

                //for spaces
                if (j == 1 || i == j || i == rows){
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
