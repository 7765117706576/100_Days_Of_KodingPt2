package OHY;

public class Day_035_Program_Bilangan_Faktorial {

    static void BilanganFaktorial() {
        int n = 5;
        int result = n;

        for (int i = n; i > 0; i--) {

            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            } else {
                System.out.print(" = ");
            }
            if(n!=i){
            result *= i;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        BilanganFaktorial();
    }
}
