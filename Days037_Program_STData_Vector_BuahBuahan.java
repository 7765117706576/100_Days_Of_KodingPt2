package OHY;

import java.util.Vector;

public class Day_033_Program_STData_Vector_BuahBuahan {
    void STData(){
        Vector<String> buah = new Vector<>();
        String []jenis = {"Pisang","Kelapa","Naga","Jeruk","Sirsak","Mangga","Nanas","Semangka"};
        for(String result : jenis){
            buah.add(result);
        }
        System.out.println("Daftar Buah : ");
        int n = 0;
        for(String Get : buah){
            System.out.println(Get);
        }
    }
    
    public static void main(String[] args) {
        Day_033_Program_STData_Vector_BuahBuahan obj = new Day_033_Program_STData_Vector_BuahBuahan();
        obj.STData();
    }
}
