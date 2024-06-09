package OHY;

public class Day_045_Pola_Persegi_B {

    public static int persegi(int a) {
        int height = 5;
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < height; j++) {
                if (j % 2 == 0) {
                    System.out.print(" +");
                } else {
                    System.out.print(" -");
                }

            }

        }
        System.out.println("");

        return a + height;
    }

    public static void main(String[] args) {
        persegi(0);
    }

}
