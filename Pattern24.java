import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        for (int i = 1; i<=rows; i++){
            //for space
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
