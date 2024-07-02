package OHY;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day_065_Program_Huruf_Yang_Sama {

    public static void SameHuruf(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata: ");
        String kata = sc.nextLine();
        Map<Character, Integer> hitungHuruf = new HashMap<>();
        for (char c : kata.toCharArray()) {
            hitungHuruf.put(c, hitungHuruf.getOrDefault(c, 0) + 1);
        }

        int jumlahHurufSama = 0;
        boolean HurufSama = false;
        
        for (int jumlah : hitungHuruf.values()) {
            if (jumlah > 1) {
                jumlahHurufSama += jumlah;
                HurufSama = true;
            }
        }

        if (HurufSama) {
            System.out.println("Jumlah huruf yang sama dalam kata \"" + kata + "\" adalah: " + jumlahHurufSama);
        } else {
            System.out.println("Tidak ada huruf yang sama dalam kata \"" + kata + "\".");
        }
    }
      public static void main(String[] args) {
      SameHuruf();
      }    
}
