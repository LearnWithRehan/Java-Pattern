import java.util.Scanner;

public class Pattern3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many line print:- ");
        int rows = sc.nextInt();
        for (int i = 1; i<=rows; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
