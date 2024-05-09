package OHY;

import java.util.HashSet;


public class Day_015_Method_Procedure_ST_Hashset {
    public static void main(String[] args) {
      HashSet();  
    }
    public static void HashSet(){
        HashSet data1 = new HashSet();
  int nilai[]={50, 67, 58, 79};
        for (int i = 0; i < nilai.length; i++) {
            data1.add(nilai[i]);
            System.out.print(nilai[i]);
            System.out.print(" ");
        }
    }
}
