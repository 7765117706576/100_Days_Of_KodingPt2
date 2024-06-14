package OHY;

public class Day_050_Pola_Shape_Play_Plus_Minus {
    public static void ShapeOfPlay(){
     int height = 5;   
        for (int i = 0; i < height; i++) {
            if(i>1){
                System.out.println();
            }
            for (int j = 0; j < i; j++) {
               if(j%2==0){
                   System.out.print(" +");
               }else{
                   System.out.print(" -");
               }
            }
        }
        for (int i = height; i>0; i--) {
            if(i!=0){
                System.out.println();
            }
            for (int j = 0; j < i; j++) {
                if(j%2==0){
                    System.out.print(" +");
                }else{
                    System.out.print(" -");
                }
            }
        }
        System.out.println("");
    }  
    public static void main(String[] args) {
        ShapeOfPlay();
    }
}
