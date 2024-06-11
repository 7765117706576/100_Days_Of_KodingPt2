package OHY;

public class Day_047_Pola_Persegi_dan_Siku_Siku {
   public static void shapePersegiXSikuSiku(){
       int height = 5;
       for (int i = 0; i < height; i++) {
           System.out.println();
           for (int j = 0; j <= i; j++) {
               System.out.print(" *");
           }
       }
       System.out.println("");
       for (int i = 0; i <height ; i++) {
          if(i!=0){
              System.out.println();
          }
           for (int j = 0; j < height; j++) {
               System.out.print(" *");
           }
       }
       System.out.println("");
   }
    public static void main(String[] args) {
        shapePersegiXSikuSiku();
    }
}
