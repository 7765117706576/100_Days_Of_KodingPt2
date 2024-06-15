package OHY;

import java.util.Scanner;

public class Day_051_Pola_Siku_SikuXSiku_Siku_Plus_Minus {

    public static void SikuXSiku() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan height :");
        int heigth = sc.nextInt();
        for (int i = heigth; 0 < i; i--) {
            if (i > 0) {
                System.out.println();
            }
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print(" -");
                } else {
                    System.out.print(" +");
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < heigth; i++) {
            if (i > 0) {
                System.out.println();
            }
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(" +");
                } else {
                    System.out.print(" -");
                }
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
    SikuXSiku();
    }
}
