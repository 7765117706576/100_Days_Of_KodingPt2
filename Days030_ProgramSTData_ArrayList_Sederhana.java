package OHY;

import java.util.ArrayList;

public class Day_026_ProgramSTData_ArrayList {

    public static void main(String[] args) {
        Day_026_ProgramSTData_ArrayList obj = new Day_026_ProgramSTData_ArrayList();
        obj.StData();
    }

    void StData() {
        ArrayList<String> object = new ArrayList<>();
        object.add("Sapi");
        object.add("Ayam");
        object.add("Ikan");
        object.add("Kambing");
        object.add("Domba");
        object.add("Elang");
        object.add("Lobster");

        //penggunaan method get()
        System.out.println(object.get(0));

        //penggunaan method remove()
        System.out.println(object.remove(1));

        //penggunaan method set()       
        System.out.println(object.set(2, "Fish"));

        int incr = 0;
        
        for (String obj : object) {
            System.out.println("data ArrayList pada index ke-"+incr+" : "+obj);
            incr++;
        }
        System.out.println("Jumlah index : "+object.size());
    }
}
