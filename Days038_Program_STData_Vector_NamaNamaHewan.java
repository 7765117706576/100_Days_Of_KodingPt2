package OHY;

import java.util.Vector;

public class Day_034_Program_STData_Vector_Hewan {
     void STData(){
        Vector<String> Hewan = new Vector<>();
        String []jenis = {"Ayam","Kelinci","Kucing","Kambing","Rusa","Jerapah","Sapi","Kudanil"};
        for(String result : jenis){
            Hewan.add(result);
        }
        System.out.println("Daftar Hewan : ");
        int n = 0;
        for(String Get : Hewan){
            System.out.println(Get);
        }
    }
    public static void main(String[] args) {
        Day_034_Program_STData_Vector_Hewan obj = new Day_034_Program_STData_Vector_Hewan();
        obj.STData();
    }
}
