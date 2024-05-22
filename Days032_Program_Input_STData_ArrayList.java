package OHY;

import java.util.ArrayList;
import java.util.Scanner;

public class Day_028_ProgramSTData_ArrayList_Scanner {

    void STData() {

        try {
            ArrayList<String> obj = new ArrayList<>();

            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan range index : ");
            int length = sc.nextInt();
            String name;
            for (int i = 0; i < length; i++) {
                System.out.print("Masukkan index ke-" + i + " : ");
                name = sc.next();
                obj.add(name);
            }
            for (int i = 0; i < obj.size(); i++) {
                System.out.println("Data ArrayList pada index ke-" + i + " : " + obj.get(i));
            }
        } catch (Exception E) {
            System.out.println("Mungkin anda menginput tipe data yang salah");
        }
    }

    public static void main(String[] args) {
        Day_028_ProgramSTData_ArrayList_Scanner obj = new Day_028_ProgramSTData_ArrayList_Scanner();
        obj.STData();
    }

}
