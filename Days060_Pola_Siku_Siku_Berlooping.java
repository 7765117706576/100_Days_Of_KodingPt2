package OHY;

public class Day_052_Pola_Siku_Siku_Berlooping {
    
    public static void SikuGanda(){
        int height = 5;
        int jml_Looping = 5;
        for (int i = 0; i < jml_Looping; i++) {
            for (int j = 0; j < height ;j++) {
                if(j>0){
                    System.out.println();
                }
                for (int k = 0; k < j; k++) {
                    System.out.print(" *");
                }
            }
            for (int j = height; j >0; j--) {
                if(j>0){
                System.out.println();
                }
                for (int k = 0; k < j; k++) {
                    System.out.print(" *");
                }
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        SikuGanda();
    }
    
}
