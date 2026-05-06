import java.util.Scanner;

public class Pattern75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows:-");
        int rows = sc.nextInt();
        char ch;
        for (int i = rows; i>=1; i--){
            ch = 'A';
            for (int j = 1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

        //half screen
        for (int i = 2; i<=rows; i++){
            ch = 'A';
            for (int j = 1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}
