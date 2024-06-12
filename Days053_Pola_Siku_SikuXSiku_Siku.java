package OHY;

public class Day_048_Pola_SikuXSiku {

    public static void ShapeSikuXSiku() {
        int height = 5;
        for (int i = height; i > 0; i--) {
            if (i < height) {
                System.out.println();
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
        }
        for (int i = 0; i < height; i++) {         
                    System.out.println();         
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
        }
    }

    public static void main(String[] args) {
        ShapeSikuXSiku();
    }
}
