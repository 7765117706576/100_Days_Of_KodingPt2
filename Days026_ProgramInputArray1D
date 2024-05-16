package OHY;

import java.util.Scanner;

public class Day_022_Program_Input_Array1D {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Day_022_Program_Input_Array1D obj = new Day_022_Program_Input_Array1D();
        obj.array1d();
    }

    public void array1d() {
        System.out.print("Masukkan jumlah indeks (int) : ");
        int indeks = sc.nextInt();
        int n[] = new int[indeks];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Indeks ke " + i + " : ");
            n[i] = sc.nextInt();
        }
        System.out.print("Nilai : ");
        System.out.print("[ ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
            if (i < n.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println(" ]");
            }
        }
    }
}
