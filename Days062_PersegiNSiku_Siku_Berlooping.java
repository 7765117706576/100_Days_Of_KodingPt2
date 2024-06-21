package OHY;

public class Day_054_Pola_Siku_SikuXPersegi_Berlooping {
   public static void SikuSikuNPersegi(){
       int height = 5;
       int jml_looping =5;
       for (int n = 0; n < jml_looping; n++) {
           
       
       for (int i = 0; i < height; i++) {
           if(i>0){
               System.out.println();
           }
           for (int j = 0; j < i; j++) {
               System.out.print("* ");
           }
       }
       for (int i = 0; i < height; i++) {
           System.out.println();
           for (int j = 0; j < height; j++) {
               System.out.print("* ");
           }
       }
           System.out.println("");
       }
   }
    public static void main(String[] args) {
        SikuSikuNPersegi();
    }
    
}
