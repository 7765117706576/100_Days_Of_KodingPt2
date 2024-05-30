package OHY;

import java.util.Scanner;

public class Day_036_Progam_Input_Bilangan_Faktorial {
   static void BilanganFaktorial(){
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       int result = n;
       for (int i = n; i > 0; i--) {
           System.out.print(i);
           if(i>1){
               System.out.print(" x ");
           }else{
               System.out.print(" = ");
           }
         if(i!=result){
             result*=i;
         }
           
       }
       System.out.println(result);
   }
    public static void main(String[] args) {
        BilanganFaktorial();
    }
}
