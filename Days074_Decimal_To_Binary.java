package OHY;

import java.util.Scanner;

public class Day_066_Desimal_To_Binary {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Desimal : ");
        int decimalNumber = sc.nextInt();

        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Hasil Representasi : " + binaryNumber);
    }
}    
