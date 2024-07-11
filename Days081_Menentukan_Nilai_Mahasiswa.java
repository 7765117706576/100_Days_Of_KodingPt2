package OHY;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day_073_Menentukan_Nilai_Mahasiswa {
public static void Nilai_Mahasiswa(){
    Scanner sc = new Scanner(System.in);
    Map<String, Double> mahasiswa = new HashMap<>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan nilai untuk " + nama + ": ");
            double nilai = sc.nextDouble();
            sc.nextLine();
            mahasiswa.put(nama, nilai);
        }

        // Menghitung nilai tertinggi
        String namaTertinggi = null;
        double nilaiTertinggi = Double.MIN_VALUE;
        double totalNilai = 0;

        for (Map.Entry<String, Double> entry : mahasiswa.entrySet()) {
            if (entry.getValue() > nilaiTertinggi) {
                nilaiTertinggi = entry.getValue();
                namaTertinggi = entry.getKey();
            }
            totalNilai += entry.getValue();
        }

    
        double rataRata = totalNilai / mahasiswa.size();

 
        System.out.println("\nHasil:");
        System.out.println("Nilai tertinggi: " + namaTertinggi + " dengan nilai " + nilaiTertinggi);
        System.out.println("Nilai rata-rata: " + rataRata);    
}
    public static void main(String[] args) {
        Nilai_Mahasiswa();
    }
}
