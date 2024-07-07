package OHY;

import java.util.Scanner;

public class Day_069_Biner_To_Hexa {
public static void MyMethod(){
     Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan biner: ");
        String biner = sc.nextLine();

        try {
            // Konversi dari biner ke desimal
            int desimal = Integer.parseInt(biner, 2);
            // Konversi dari desimal ke hexadesimal
            String hexadesimal = Integer.toHexString(desimal).toUpperCase();
            System.out.println("Hasil konversi ke hexadesimal: " + hexadesimal);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Pastikan hanya memasukkan angka biner (0 atau 1).");
        }    
}
    public static void main(String[] args) {
           MyMethod();
    }
}
