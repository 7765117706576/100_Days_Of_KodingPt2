package STData;

public class Algoritma_Binary_Search {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

         
            if (arr[mid] == target) {
                return mid;
            }

          
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 72;

        int resultIndex = binarySearch(array, target);

        if (resultIndex != -1) {
            System.out.println("Elemen " + target + " ditemukan di indeks-" + resultIndex);
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan dalam array.");
        }
    }    
}
