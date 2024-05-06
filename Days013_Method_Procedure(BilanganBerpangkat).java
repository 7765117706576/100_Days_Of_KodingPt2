package OHY;

public class Day_010_Method_Procedure_BilanganBerpangkat {

    public static void main(String[] args) {
        BilanganBerpangkat();
    }

    public static void BilanganBerpangkat() {
        int n1 = 6;
        int p = 2;
        int result = n1;

        for (int j = 0; j < p; j++) {
            if (j > 0) {
                System.out.print(" x ");
            }
            System.out.print(n1);
        }
        for (int i = 1; i < p; i++) {
            result *= n1;

        }
        System.out.println(" = " + result);
    }

}
