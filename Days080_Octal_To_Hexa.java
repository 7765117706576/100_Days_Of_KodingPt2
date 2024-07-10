package OHY;

import java.util.Scanner;

public class Day_072_Bilangan_Octal_To_Hexa {
public static void Octal_To_Hexa(){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan oktal: ");
        String octalNum = scanner.nextLine();

        // Konversi bilangan oktal ke bilangan desimal
        int decimalNum = Integer.parseInt(octalNum, 8);
        // Konversi bilangan desimal ke bilangan heksadesimal
        String hexadecimalNum = Integer.toHexString(decimalNum).toUpperCase();

        System.out.println("Bilangan heksadesimal: " + hexadecimalNum);    
}
    public static void main(String[] args) {
        Octal_To_Hexa();
    }    
}
