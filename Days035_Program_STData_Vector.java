package OHY;

import java.util.Vector;

public class Day_031_Program_STData_Vector {

    void STData() {
        //Penggunaan Struktur Data Vector untuk semua tipe data
        Vector data = new Vector();
        String object = "Kucing";
        int Integer = 10;
        byte Byte = 2;
        short Short = 50;
        long Long = 100;
        double Double = 67.7;
        char char6 = 'A';
        float Float = 2.9f;

        data.add(object);
        data.add(Byte);
        data.add(Short);
        data.add(Integer);
        data.add(Long);
        data.add(Float);
        data.add(Double);
        data.add(char6);
        int s = data.size();
        System.out.println("Pendeklarasian yang memuat berbagai tipe data : ");
        for (int i = 0; i < s; i++) {
            System.out.println("Indeks ke-" + i + " diisi oleh : " + data.get(i));
        }
        System.out.println("");

        System.out.println("Hasil data dari beberapa tipe data : ");
        System.out.println("String : " + data.get(0));
        System.out.println("byte   : " + data.get(1));
        System.out.println("int    : " + data.get(2));
        System.out.println("short  : " + data.get(3));
        System.out.println("long   : " + data.get(4));
        System.out.println("float  : " + data.get(5));
        System.out.println("double : " + data.get(6));
        System.out.println("char   : " + data.get(7));
        System.out.println("------------------------");
              
    }

        void STDataB (){
        System.out.println("Pendeklarasian yang hanya memuat 1 tipe data saja : ");
        // Tambahkan Kurung Diamond untuk menyimpan data dengan 1 jenis tipe data
        Vector<String> hewan = new Vector<>();

        hewan.add("Kambing");
        hewan.add("Ayam");
        hewan.add("bebek");
        //Dapat juga menggunakan tipe data untuk menambahkan object pada indeks data
        //Contoh :
        String sapi = "Sapi";
        String ikan = "Ikan";
        String domba = "Domba";
        hewan.add(sapi);
        hewan.add(ikan);
        hewan.add(domba);
        
        int incr = 0;
        for(String obj : hewan){
            System.out.println("Indeks ke-"+incr+" diisi oleh : "+obj);
            incr++;
        }
        
    }
    
    public static void main(String[] args) {
        Day_031_Program_STData_Vector obj = new Day_031_Program_STData_Vector();
        obj.STData();
        obj.STDataB();
    }

}
