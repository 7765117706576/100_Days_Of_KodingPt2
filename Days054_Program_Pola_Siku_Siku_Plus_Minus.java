package OHY;

public class Day_049_Pola_Siku_Siku_Plus_Minus {
    public static void ShapeOfSikuSiku(){
       int height = 5;
        for (int i = 0; i < 5; i++) {
            if(i>1){
                System.out.println();
            }
            for (int j = 0; j < i; j++) {
                if (j%2==0){
                    System.out.print(" -");
                }else{
                    System.out.print(" +");
                }
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        ShapeOfSikuSiku();
    }
    
}
