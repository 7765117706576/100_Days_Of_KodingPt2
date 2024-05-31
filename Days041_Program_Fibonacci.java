package OHY;

public class Day_037_Program_Fibonacci {
   static void fiboWithNacci(){
       int f1 = 0;
       int f2 = 1;
       int n = 6;
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
        fiboWithNacci();
    }
  
}
