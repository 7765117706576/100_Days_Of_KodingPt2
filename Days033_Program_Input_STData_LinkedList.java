package OHY;

import java.util.LinkedList;
import java.util.Scanner;

public class Day_029_Program_STData_LinkedList_Scanner {

    Scanner sc = new Scanner(System.in);

    void STdata() {
        try {
            LinkedList<String> data = new LinkedList<>();
            String object;
            System.out.print("Masukkan range index : ");
            int range = sc.nextInt();
            for (int i = 0; i < range; i++) {
                System.out.print("Masukkan data LinkedList pada index ke-" + i + " : ");
                object = sc.next();
                data.add(object);
            }
            int incr = 0;
            for (String obj : data) {
                System.out.println("Data pada index ke-" + incr + " : " + data.get(incr));
                incr++;
            }
        } catch (Exception e) {
            System.out.println("Error");

        }
    }

    public static void main(String[] args) {
       Day_029_Program_STData_LinkedList_Scanner obj = new Day_029_Program_STData_LinkedList_Scanner();
       obj.STdata();
    }

}
