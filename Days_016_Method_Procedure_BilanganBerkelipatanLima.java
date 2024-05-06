package OHY;

public class Day_013_Method_Procedure_Bilangan_berkelipatanLima {
    public static void main(String[] args) {
       BilanganBerkelipatanLima(); 
    }
    public static void BilanganBerkelipatanLima(){
        int nAwal = 1;
        int Akhir = 30;
        int result = 0;
        int incr =0;
        for (int i = nAwal; i <= Akhir; i++) {
            
            if(i%5==0){
                System.out.print(i);
               if(i<=Akhir-1){
                   System.out.print(" + ");
               }
              result+=i; 
              incr++;
            }
        }
        System.out.println(" = "+result);
        System.out.println("Avg = "+(result/incr));
    }
}
