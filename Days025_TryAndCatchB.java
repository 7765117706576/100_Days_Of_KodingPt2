package OHY;

import java.util.Scanner;

public class Day_021_Program_Try_and_Catch_B {
   Scanner sc = new Scanner (System.in); 
    public static void main(String[] args) {
      Day_021_Program_Try_and_Catch_B obj = new Day_021_Program_Try_and_Catch_B();
      try{obj.MyCitraL();
    }catch(Exception E){
          System.out.println("Eror");
    }
    }
 public void MyCitraL(){
     System.out.print("Masukkan nama(tipe String) : ");
     String n = sc.nextLine();
     System.out.println("Masukkan umur (tipe int ) : ");
     int u = sc.nextInt();
     System.out.println("Nama : "+n);
     System.out.println("Umur : "+u+" Thn");
 }

}
