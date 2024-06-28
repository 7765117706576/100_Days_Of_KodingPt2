package OHY;

public class Day_061_Bilangan_Random_Ganjil_Genap {
    public static void bil_Random(){
        int x = 1;
        int y = 100;
        int bil_rand = x + (int)(Math.random()*((y-x)+1));
        System.out.println("Bilangan random : "+bil_rand);
        
        if(bil_rand%2==0){
            System.out.println("Bilangan genap");
        }else{
            System.out.println("Bilangan ganjil");
        }
    }
    public static void main(String[] args) {
        bil_Random();
    }
    
}
