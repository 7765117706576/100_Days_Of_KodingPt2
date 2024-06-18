package STData;

public class Algoritma_Jump_Search {
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.sqrt(n); // Ukuran lompatan
        
        // Mencari blok tempat elemen target mungkin berada
        int prev = 0;
        while (prev < n && arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1;
            }
        }
        
        // Melakukan pencarian linear di dalam blok yang ditemukan
        while (arr[prev] < target) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }
        
        // Jika elemen ditemukan, kembalikan indeksnya
        if (arr[prev] == target) {
            return prev;
        }
        
        return -1; // Jika elemen tidak ditemukan
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int target = 11;
        
        int resultIndex = jumpSearch(array, target);
        
        if (resultIndex != -1) {
            System.out.println("Elemen " + target + " ditemukan di indeks-" + resultIndex);
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan dalam array.");
        }
    }
}
 

