package OHY;

import java.util.Scanner;

public class Day_056_Program_Konversi_Mata_Uang_D {
     public static void Konversi(){
        Scanner sc = new Scanner (System.in);
        double Mata_Uang;
        String JenisMataUang;
        System.out.print("1. Konversi Dinar to Rupiah\n2. Konversi Rupiah to Dinar\n:");
        int pil=sc.nextInt();
        if(pil==1){
            System.out.print("Dinar : ");
            Mata_Uang =sc.nextDouble()*54000;
            JenisMataUang = " Rupiah";
        }else{
            System.out.println("Rupiah : ");
            Mata_Uang = sc.nextDouble()/54000;
            JenisMataUang =" Dinar";
        }
        System.out.println("Nilai Konversi : "+Mata_Uang+JenisMataUang);
    }
    
    public static void main(String[] args) {
        Konversi();
    }
    
}
