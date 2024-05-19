package OHY;

import java.util.Scanner;

public class Day_025_ProgramWhileB {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       Day_025_ProgramWhileB obj = new Day_025_ProgramWhileB();
        obj.While();
    }
    private void While() {
        System.out.print("Masukkkan angka ganjil : ");
        int n = sc.nextInt();
        while (n % 2 == 0) {
            System.out.print("Angka ganjil bang : ");
            n = sc.nextInt();
        }
        System.out.println("Sipp");
    }
}
