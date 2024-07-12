package OHY;

import java.util.Scanner;

public class Day_074_Octal_To_Biner {
     public static String octalKeBiner(String oktal) {
        // Mengubah bilangan oktal ke bilangan desimal
        int desimal = Integer.parseInt(oktal, 8);
        // Mengubah bilangan desimal ke bilangan biner
        String biner = Integer.toBinaryString(desimal);
        return biner;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Bilangan octal : ");
        String oktalNumber = sc.nextLine();
        String binary = octalKeBiner(oktalNumber);
        System.out.println("Bilangan oktal " + oktalNumber + " dalam bilangan biner adalah " + binary);
    }
}
