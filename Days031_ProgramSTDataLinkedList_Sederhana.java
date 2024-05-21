package OHY;

import java.util.LinkedList;

public class Day_027_ProgramSTData_LinkedList {
    void STDataLinkedList(){
        LinkedList<Double> nilai = new LinkedList<>();
        nilai.add(12.5);
        nilai.add(30.0);
        nilai.add(15.8);
        nilai.add(24.5);
        nilai.add(26.9);
        nilai.add(2.9);
        nilai.add(43.2);
        nilai.add(27.23);
        
        //Method getFirst();
        System.out.println("Penggunaan method getFirst : "+nilai.getFirst());
        
        //Method getLast();
        System.out.println("Penggunaan method getLast : "+nilai.getLast());
        
        //method getIndex();
        System.out.println("Penggunaan method getIndex : "+nilai.get(3));
        
        //method remove();
        System.out.println("Penggunaan method remove : "+nilai.remove(3));
        
        //method removeFirst()
        System.out.println("Penggunaan method removeFirst : "+nilai.removeFirst());
        
        //method removeLast()
        System.out.println("Penggunaan method removeLast : "+nilai.removeLast());
        
        int incr = 0;
        
        for(double n : nilai){
            System.out.println("index ke-"+incr+" : "+n);
            incr++;
        }
        
        
    }
    public static void main(String[] args) {
       Day_027_ProgramSTData_LinkedList obj = new Day_027_ProgramSTData_LinkedList();
        obj.STDataLinkedList();
    }
}
