package OHY;

import java.util.*;

public class Day_060_Program_huruf_Random {
public static char getRandomChar(String teks) {
        if (teks == null || teks.isEmpty()) {
            throw new IllegalArgumentException("Teks tidak boleh kosong/null");
        }
        Random rand = new Random();
        int indeksAcak = rand.nextInt(teks.length());
        return teks.charAt(indeksAcak);
    }
    public static void main(String[] args) {
        String teks = "Aku suka belajar koding";
        char hurufAcak = getRandomChar(teks);
        System.out.println("Huruf acak dari teks: " + hurufAcak);
    }   
}
