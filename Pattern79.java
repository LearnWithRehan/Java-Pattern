import java.util.Scanner;

public class Pattern79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows:-");
        int rows = sc.nextInt();
        char ch;
        for (int i= 1; i<=rows; i++){
            ch = 'A';
            //spaces
            for (int j = 2*rows-i; j>i; j--){
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        //lower half  of the pattern
        for (int i = rows-1; i>=1; i--){
            ch = 'A';
            //spaces
            for (int j = 2*rows-i; j>i; j--){
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }


        sc.close();
    }
}
