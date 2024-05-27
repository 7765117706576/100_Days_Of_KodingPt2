package OHY;

import java.util.Vector;

public class Day_032_Program_MAXMIN_STData_Vector {
    void STdata(){
        Vector<Double> data = new Vector<>();
        double nilai[] = {91.35, 4.72, 26.0, 3.5, 8.0, 61.0, 65.36, 12.0, 5.6,
            7.11, 27.0, 9.53, 549.0, 2.23, 17.31, 4.25,
            2.13, 83.0, 7.0, 102.4, 53.21, 3.42, 0.21, 70.02,
            819.4, 6173.0, 4.25, 19.8, 17.35, 5.768};
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for(double v : nilai){
            data.add(v);
        }
        for(double value : data){
            if(value<min){
                min = value;
            }
            if(value>max){
                max = value;
            }
            sum+=value;
        }
        int size = data.size();
        System.out.println("SUM : "+sum);
        System.out.println("MAX : "+max);
        System.out.println("MIN : "+min);
        System.out.println("AVG : "+(sum/size));
    }
    public static void main(String[] args) {
       Day_032_Program_MAXMIN_STData_Vector obj = new Day_032_Program_MAXMIN_STData_Vector();
        obj.STdata();
    }
}


