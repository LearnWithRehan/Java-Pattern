import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:- ");
        int rows = sc.nextInt();
        for (int i = rows; i>=1; i--){
            //for spacing
            for (int j = 2*rows-i; j>i; j--){
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
