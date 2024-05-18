package OHY;

import java.util.Scanner;

public class Day_024_ProgramWhile {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Day_024_ProgramWhile obj = new Day_024_ProgramWhile();
        obj.While();
    }

    private void While() {
        System.out.print("Masukkkan angka genap : ");
        int n = sc.nextInt();
        while (n % 2 == 1) {
            System.out.print("Angka genap bang : ");
            n = sc.nextInt();
        }
        System.out.println("Sipp");
    }
}
