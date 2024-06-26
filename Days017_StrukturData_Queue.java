package STRUKTUR_DATA1;

import java.util.LinkedList;
import java.util.Queue;

public class StrukturData_Queue {

    public static void main(String[] args) {
        Queue<Double> data = new LinkedList();
        double nilai[] = {91.35, 4.72, 26.0, 3.5, 8.0, 61.0, 65.36, 12.0, 5.6,
            7.11, 27.0, 9.53, 549.0, 2.23, 17.31, 4.25,
            2.13, 83.0, 7.0, 102.4, 53.21, 3.42, 0.21, 70.02,
            819.4, 6173.0, 4.25, 19.8, 17.35, 5.768};

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        for (int i = 0; i < nilai.length; i++) {
            data.offer(nilai[i]);
        }
        double size = data.size();
        for (int i = 0; i < size; i++) {
            double item = data.poll();
            if (item < min) {
                min = item;
            }
            if (item > max) {
                max = item;
            }
            sum += item;
        }

        System.out.println("data offer : " + data.offer(12.3));
        double avg = sum / size;
        System.out.println("sum : " + sum);
        System.out.println("max : " + max);
        System.out.println("min : " + min);

        System.out.println("avg : " + avg);

    }
}
