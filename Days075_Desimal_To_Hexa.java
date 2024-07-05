package OHY;

import java.util.Scanner;

public class Day_067_Desimal_To_Hexa{
    public static String desimalKeHexadesimal(int desimal) {
        if (desimal == 0) {
            return "0";
        }

        StringBuilder hexadesimal = new StringBuilder();
        char[] hexChar = "0123456789ABCDEF".toCharArray();

        while (desimal > 0) {
            int sisa = desimal % 16;
            hexadesimal.insert(0, hexChar[sisa]);
            desimal = desimal / 16;
        }

        return hexadesimal.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan desimal: ");
        int desimal = scanner.nextInt();
        String hasil = desimalKeHexadesimal(desimal);
        System.out.println("Bilangan hexadesimal dari " + desimal + " adalah: " + hasil);
    }
    
}
