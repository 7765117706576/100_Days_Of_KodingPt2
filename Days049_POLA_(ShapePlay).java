package OHY;

public class Day_044_Program_Pola_Play {

    public static void shapePlay() {
        int tinggi = 5;
        for (int i = 0; i <=tinggi; i++) {
           if(i!=0&&i!=1){
               System.out.println();
           }
            for (int j = 0; j < i; j++) {
                if(j!=0){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(i==tinggi){
                System.out.println("");
            }
        }
          
        for (int i = tinggi; 0 <= i; i--) {
            if (i != tinggi) {
                System.out.println();
            }
            for (int j = 0; j <= i; j++) {
                if (j != 0) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        shapePlay();
    }
}
