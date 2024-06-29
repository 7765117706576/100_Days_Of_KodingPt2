package OHY;

import java.util.Random;

public class Day_062_Program_Huruf_Random_Beserta_Indeks {
public static void huruf_Random(){
        //Membuat Program huruf random dengan indeksnya
        char[] huruf = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        Random random = new Random();
        int indeksHuruf = random.nextInt(huruf.length);
        char hurufRandom = huruf[indeksHuruf];
        System.out.println("Huruf yang diambil: " + hurufRandom);
        System.out.println("Indeks huruf : " + indeksHuruf);
}
    public static void main(String[] args) {
        huruf_Random();
    }
}
