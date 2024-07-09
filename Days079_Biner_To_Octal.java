package OHY;

import static OHY.Day_070_Biner_To_Desimal.binerKeDesimal;
import java.util.Scanner;

public class Day_071_Biner_To_Octal {
public static String desimalKeOktal(int desimal) {
        StringBuilder oktal = new StringBuilder();
        
        while (desimal > 0) {
            oktal.insert(0, desimal % 8);
            desimal /= 8;
        }
        
        return oktal.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan biner: ");
        String biner = scanner.nextLine();
        
        // Memastikan input hanya terdiri dari 0 dan 1
        if (biner.matches("[01]+")) {
            int desimal = binerKeDesimal(biner);
            String oktal = desimalKeOktal(desimal);
            System.out.println("Bilangan oktal dari " + biner + " adalah " + oktal);
        } else {
            System.out.println("Input tidak valid. Silakan masukkan bilangan biner yang benar.");
        }
        
        scanner.close();
    }
}    

