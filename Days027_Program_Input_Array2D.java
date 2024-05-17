package OHY;

import java.util.Scanner;

public class Day_023_Program_Input_Array2D {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Day_023_Program_Input_Array2D obj = new Day_023_Program_Input_Array2D();
        obj.Array2DB();
    }

    public void Array2D() {
        System.out.print("Masukkan jumlah indeks (int): ");
        int jumlah = sc.nextInt();
        String[] nama = new String[jumlah];
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nama ke-" + i + " : ");
            nama[i] = sc.next();
        }
        System.out.println("Value : ");
        System.out.print("[ ");
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i]);
            if (i < nama.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println(" ]");
            }
        }

    }

    public void Array2DB() {
        System.out.print("Masukkan jumlah indeks pada dimensi kedua : ");
        int j2 = sc.nextInt();
        String[][] nama = new String[j2][j2];
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nama ke-" + i + " : ");
            nama[i][i] = sc.next();
        }
        System.out.print("Value : ");
        System.out.print("[ ");
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i][i]);
            if (i < nama.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print(" ]");
            }
        }
    }
}
