package POLA;
public class POLA_A {
    public static void POLA(){
    int tinggi = 4;
        
         for (int i = 0; i < tinggi; i++) {
            System.out.print("*");
            for (int j = 0; j < tinggi; j++) {
                System.out.print(" *");   
            }
            System.out.println("");
        }
        
        
}
    public static void main(String[] args) {
        POLA();
        System.out.println("");
    }
}
