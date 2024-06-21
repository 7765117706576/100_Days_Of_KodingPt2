package OHY;

public class Day_053_Pola_Persegi_Berlooping {

    public static void persegi() {
        int jml_looping = 5;
        int height = 5;
        for (int i = 0; i <jml_looping; i++) {

            for (int j = 0; j < height; j++) {
                System.out.println();
                for (int k = 0; k < height; k++) {
                    System.out.print(" *");
                }
                
            }System.out.println("");
        }
    }

    public static void main(String[] args) {
        persegi();
    }

}
