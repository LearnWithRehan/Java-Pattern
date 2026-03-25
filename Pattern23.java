import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows:- ");
        int rows = sc.nextInt();
        for (int i = rows; i>=1; i--){
            //for spaces
            for (int j = 1; j<i; j++){
                System.out.print(" ");
            }
            for (int j = rows; j>=i; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
