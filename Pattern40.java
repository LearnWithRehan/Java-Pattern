import java.util.Scanner;

public class Pattern40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows");
        int rows = sc.nextInt();
        for (int i = 1; i<=rows; i++){
            for (int j = i; j<=rows; j++){
                System.out.print(j+" ");
            }
            for (int k = 1; k<i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
