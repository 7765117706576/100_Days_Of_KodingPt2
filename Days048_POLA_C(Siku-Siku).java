package OHY;

public class Day_043_Program_Pola_B {
    public static void method(){
        int tinggi =5;
        for (int i = 0; i < tinggi; i++) {
            System.out.print("*");
            for (int j = tinggi; i < j; j--) {
                System.out.print(" *");   
            }
            System.out.println("");
        }
        System.out.println("*");
    }
    
    public static void main(String[] args) {
        method();
    }
    
}
