package OHY;

public class Day_046_Pola_Persegi_C {
    public static int shapeC(){
        int height = 5;
        for (int i = 0; i < height; i++) {
            if(i!=0){
                System.out.println("");
            }
            for (int j = 0; j <height ; j++) {
                if(i%2==0){
                    System.out.print(" +");
                }else{
                    System.out.print(" -");
                }
            }           
        }
        System.out.println("");
        return height;
    }
    public static void main(String[] args) {
        shapeC();
    }
    
}
