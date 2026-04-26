import java.util.Scanner;

public class Pattern56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows:-");
        int rows = sc.nextInt();
        for (int i = 1; i<=rows; i++){
            for (int j = 1; j<=rows; j++){

                //for spaces
                if (i == 1 || j == 1 || i == rows || j == rows){
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
