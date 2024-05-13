package METHOD_METHOD;


import java.util.Scanner;

public class test {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        test objek = new test();
        System.out.println(objek.bio("method", "\nprocedure"));
        System.out.println("");
        objek.ganjilgenapSwitchCase();
        objek.ganjilgenapif_else();
        objek.ternary();
        
    }

    public static String bio(String nama, String alamat) {
        return nama + alamat;
    }

    public  void ganjilgenapSwitchCase() {
        System.out.println("program ganjil genap switch-case");
        int n = sc.nextInt();
        switch (n % 2) {
            case 0:
                System.out.println("genap");
                break;
            case 1:
                System.out.println("ganjil");
                break;
        }
    }

    private int ganjilgenapif_else() {
        System.out.println("program ganjil genap if-else");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
        return n;
    }

    private void ternary() {
        System.out.println("program ganjil genap ternary");
        int n = sc.nextInt();
        String ternary = (n % 2 == 0) ? "genap" : "ganjil";
        System.out.println(ternary);

    }
}
