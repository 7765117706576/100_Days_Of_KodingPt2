package OHY;

import java.util.Scanner;

public class Day_068_Desimal_To_Octal {
public static void DesimalToOctal(){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan desimal: ");
        int desimal = scanner.nextInt();
        String oktal = Integer.toOctalString(desimal);
        System.out.println("Hasil konversi ke oktal: " + oktal);    
}
    public static void main(String[] args) {
        DesimalToOctal();
    }
}
