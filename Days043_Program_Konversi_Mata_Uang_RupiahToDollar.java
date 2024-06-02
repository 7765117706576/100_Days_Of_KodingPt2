package OHY;

import java.util.Scanner;

public class Day_039_Program_Konversi_MataUang {

    public static void Konversi() {
        Scanner sc = new Scanner(System.in);
        int pil = 1;
        int jml_Uang;
        switch (pil) {
            case 1:
                System.out.print("Konversi Rupiah ke Dollar : ");
                jml_Uang = sc.nextInt() * 16000;
                System.out.println("hasil : "+jml_Uang);
                break;
            case 2:
                System.out.println("Konversi Dollar ke Rupiah : ");
                jml_Uang = sc.nextInt() / 16000;
                System.out.println("hasil : "+jml_Uang);
                break;
            default :
                System.out.println("Pilihan tak tersedia");
                break;

        }
         
    }

    public static void main(String[] args) {
Konversi();
    }
}
