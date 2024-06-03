package OHY;

import java.util.Scanner;

public class Day_040_Program_Konversi_MataUang_B {
    public static void Konversi(){
        Scanner sc = new Scanner (System.in);
        int Nominal;
        double Mata_Uang;
        String JenisMataUang;
        System.out.print("1. Konversi PoundSterling to Rupiah\n2. Konversi Rupiah to PoundSterling\n:");
        int pil=sc.nextInt();
        if(pil==1){
            System.out.print("PoundSterling : ");
            Mata_Uang =sc.nextDouble()*20000;
            JenisMataUang = " Rupiah";
        }else{
            System.out.println("Rupiah : ");
            Mata_Uang = sc.nextDouble()/20000;
            JenisMataUang =" PoundSterling";
        }
        System.out.println("Nilai Konversi : "+Mata_Uang+JenisMataUang);
    }
    public static void main(String[] args) {
        Konversi();
    }
}
