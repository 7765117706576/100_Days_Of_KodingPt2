package OHY;

public class Day_014_Method_Procedure_Bilangan {

    public static void main(String[] args) {
        BilanganBerkelipatan10();
    }

    public static void BilanganBerkelipatan10() {

        int n = 1;
        int btsAkhir = 100;
        double r = 0;
        int incr=0;
        for (int i = n; i <= btsAkhir; i++) {
            if (i % 10 == 0) {
                System.out.print(i);

                if (i < btsAkhir - 1) {
                    System.out.print(" + ");

                }
                r += i;
                incr++;
            }
        }
        System.out.print(" = " + r);
        System.out.println("");
        System.out.println("AVG = " + r/incr);
    }
}
