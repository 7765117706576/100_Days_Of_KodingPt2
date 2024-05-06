package OHY;

public class Day_012_Method_Procedure_BilanganGenap extends Day_011_Method_Procedure_BilanganGanjil {

    public static void main(String[] args) {
        Bilangan_Genap();
    }

    public static void Bilangan_Genap() {
        int nAwal = 1;
        int BtsAkhir = 10;
        int result = 0;

        for (int i = nAwal; i <= BtsAkhir; i++) {

            if (i % 2 == 0) {
                System.out.print(i);
                if (i < BtsAkhir - 1) {
                    System.out.print(" + ");
                    
                }
                result+=i;
            }

        }
        System.out.print(" = "+result);
        System.out.println("");
    }
}
