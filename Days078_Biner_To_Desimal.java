package OHY;
import java.util.Scanner;

public class Day_070_Biner_To_Desimal {
    // Fungsi untuk mengkonversi biner ke desimal
    public static int binerKeDesimal(String biner) {
        int desimal = 0;
        int panjang = biner.length();
        
        for (int i = 0; i < panjang; i++) {
            if (biner.charAt(i) == '1') {
                desimal += Math.pow(2, panjang - i - 1);
            }
        }
        
        return desimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan biner: ");
        String biner = sc.nextLine();
        
        // Memastikan input hanya terdiri dari 0 dan 1
        if (biner.matches("[01]+")) {
            int desimal = binerKeDesimal(biner);
            System.out.println("Bilangan desimal dari " + biner + " adalah " + desimal);
        } else {
            System.out.println("Input tidak valid. Silakan masukkan bilangan biner yang benar.");
        }
        
        sc1.close();
    }
}    

