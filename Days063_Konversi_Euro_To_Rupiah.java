package OHY;

import java.util.Scanner;

public class Day_055_Konversi_Mata_Uang_C {
     public static void Konversi(){
        Scanner sc = new Scanner (System.in);
        double Mata_Uang;
        String JenisMataUang;
        System.out.print("1. Konversi Euro to Rupiah\n2. Konversi Rupiah to Euro\n:");
        int pil=sc.nextInt();
        if(pil==1){
            System.out.print("Euro : ");
            Mata_Uang =sc.nextDouble()*18000;
            JenisMataUang = " Rupiah";
        }else{
            System.out.println("Rupiah : ");
            Mata_Uang = sc.nextDouble()/18000;
            JenisMataUang =" Euro";
        }
        System.out.println("Nilai Konversi : "+Mata_Uang+JenisMataUang);
    }
     public static void main(String[] args) {
        Konversi();
    }
}
