package OHY;

import java.util.Scanner;

public class Day_020_Program_Try_and_Catch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukkan n dalam batas 127 : ");
            byte n = sc.nextByte();
            String ternaryOperator = (n % 2 == 0) ? "Genap" : "Ganjil";
            System.out.println(ternaryOperator);
        } catch (Exception E) {
            System.out.println("Jumlah input tidak boleh lebih dari 127");
        }
    }
}
