package OHY;

import java.util.LinkedList;

public class Day_030_Program_MINMAX_LinkedList {

    public static void main(String[] args) {
        Day_030_Program_MINMAX_LinkedList data = new Day_030_Program_MINMAX_LinkedList();
        data.STdata();
    }

    void STdata() {
        LinkedList<Double> nilai = new LinkedList<>();
        double n[] = {91.35, 4.72, 26.0, 3.5, 8.0, 61.0, 65.36, 12.0, 5.6,
            7.11, 27.0, 9.53, 549.0, 2.23, 17.31, 4.25,
            2.13, 83.0, 7.0, 102.4, 53.21, 3.42, 0.21, 70.02,
            819.4, 6173.0, 4.25, 19.8, 17.35, 5.768};
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double item = 0;
        double sum = 0;
        for (double i : n) {
            nilai.add(i);
        }
        
        int size = nilai.size();
        for (int i = 0; i < size; i++) {
            item = nilai.get(i);
            if (item < min) {
                min = item;
            }
            
            if (item > max) {
                max = item;
            }
            sum += item;
        }
        System.out.println("SUM : " + sum);
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
        System.out.println("AVG : " + (sum / size));
    }
}
