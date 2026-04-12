public class Pattern47 {
    public static void main(String[] args) {
        int height= 15;
        int width = 45;

        for (int i = 1; i<=height; i++){
            for (int j = 1; j<=width; j++){
                //Top Stripe (Saffron)
                if (i <= height / 3){
                    System.out.print("*");

                }
                //Middle stripe (white with Ashoka Chakra)
                else if (i <= 2 * height / 3) {
                    if (j == width / 2){
                        System.out.print("0");
                    }else {
                        System.out.print(" ");
                    }

                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}
