package STData;
public class Algoritma_Linear_Search {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 10, 4, 6, 2, 8, 3 };
        int target = 6;
        
        int result = linearSearch(array, target);
        
        if (result == -1) {
            System.out.println("Elemen " + target + " tidak ditemukan di dalam array.");
        } else {
            System.out.println("Elemen " + target + " ditemukan di indeks ke-" + result + ".");
        }
    }
}
