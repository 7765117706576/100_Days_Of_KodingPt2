package OHY;

import java.util.Scanner;


public class Day_038_Program_Input_Fibonacci {
    Scanner sc = new Scanner(System.in);
   void fiboScanner(){
       int f1 = 0;
       int f2 = 1;
       System.out.print("Masukkan N : ");
       int n = sc.nextInt();
       System.out.println("Batas deret : "+n);
       int fn;
       System.out.print("Deretan : "+f1+" ,");
       System.out.print(" "+f2);
       for (int i = 1; i < n ; i++) {
           fn = f1+f2;
           System.out.print(" , "+fn);
           f1=f2;
           f2=fn;
       }
       System.out.println("");
   } 
    public static void main(String[] args) {
        Day_038_Program_Input_Fibonacci obj = new Day_038_Program_Input_Fibonacci();
    }
}
