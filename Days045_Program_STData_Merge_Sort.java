package STData;


import java.util.Arrays; // Import library Arrays untuk menggunakan metode toString dan copyOfRange

public class Merge_Sort {

    public static void main(String[] args) {
        
        int[] data10 = {5, 2, 4, 6, 1, 3, 9, 7, 8, 0};
        System.out.println("Data awal (10 elemen): " + Arrays.toString(data10));
        
        long startTime10 = System.currentTimeMillis();
        data10 = mergeSort(data10); // Panggil metode mergeSort untuk mengurutkan array data
        long endTime10 = System.currentTimeMillis();
        long durasi10 = endTime10 - startTime10; 
        System.out.println("Data terurut (10 elemen): " + Arrays.toString(data10)); // Cetak array setelah diurutkan
        System.out.println("Durasi (10 elemen): " + durasi10 + " ms");

        int[] data1000 = new int[1000];
        for (int i = 0; i < data1000.length; i++) {
            data1000[i] = (int) (Math.random() * 1000); 
        }
        System.out.println("Data awal (1000 elemen): " + Arrays.toString(data1000));
        
        long startTime1000 = System.currentTimeMillis();
        data1000 = mergeSort(data1000); // Panggil metode mergeSort untuk mengurutkan array data
        long endTime1000 = System.currentTimeMillis();
        long durasi1000 = endTime1000 - startTime1000; 
        System.out.println("Data terurut (1000 elemen): " + Arrays.toString(data1000));
        System.out.println("Durasi (1000 elemen): " + durasi1000 + " ms");
    }

    // Metode untuk melakukan merge sort pada array
    private static int[] mergeSort(int[] data) {
        // Base case: jika panjang array kurang dari atau sama dengan 1, kembalikan array
        if (data.length <= 1) {
            return data;
        }

        // Hitung titik tengah array
        int tengah = data.length / 2;
        // Bagi array menjadi dua bagian: kiri dan kanan
        int[] kiri = Arrays.copyOfRange(data, 0, tengah);
        int[] kanan = Arrays.copyOfRange(data, tengah, data.length);

        // Rekursif panggil mergeSort pada bagian kiri dan kanan
        kiri = mergeSort(kiri);
        kanan = mergeSort(kanan);

        // Gabungkan bagian kiri dan kanan yang sudah terurut
        return merge(kiri, kanan);
    }

    // Metode untuk menggabungkan dua array terurut menjadi satu array terurut
    private static int[] merge(int[] kiri, int[] kanan) {
        int[] hasil = new int[kiri.length + kanan.length]; // Buat array hasil dengan ukuran gabungan dari kiri dan kanan
        int i = 0, j = 0, k = 0; // Inisialisasi indeks untuk kiri, kanan, dan hasil

        // Gabungkan elemen-elemen dari kiri dan kanan ke dalam hasil
        while (i < kiri.length && j < kanan.length) {
            if (kiri[i] <= kanan[j]) { // Jika elemen di kiri lebih kecil atau sama dengan elemen di kanan
                hasil[k] = kiri[i]; // Tambahkan elemen kiri ke hasil
                i++; // Tingkatkan indeks kiri
            } else {
                hasil[k] = kanan[j]; // Tambahkan elemen kanan ke hasil
                j++; // Tingkatkan indeks kanan
            }
            k++; // Tingkatkan indeks hasil
        }

        // Tambahkan sisa elemen dari kiri ke hasil
        while (i < kiri.length) {
            hasil[k] = kiri[i];
            i++;
            k++;
        }

        // Tambahkan sisa elemen dari kanan ke hasil
        while (j < kanan.length) {
            hasil[k] = kanan[j];
            j++;
            k++;
        }

        return hasil; // Kembalikan array hasil yang sudah terurut
    }
}
