package OHY;
import java.util.Scanner;
public class Day_064_Program_Menentukan_Jumlah_Kalimat {
public static void MyMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Kalimat : ");
        String kalimat = sc.nextLine();
        String[] kataArray = kalimat.trim().split(" ");
        int jmlKata = kataArray.length;
        System.out.println("Jumlah kata: " + jmlKata);

        sc.close();
    }
    public static void main(String[] args) {
        MyMethod();
    }
 
}
