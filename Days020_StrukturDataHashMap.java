package OHY;
import java.util.HashMap;
public class Day_017_Method_Procedure_STHashMap {
    public static void main(String[] args) {
        HashMap();
    }
    public static void HashMap() {
        HashMap data1 = new HashMap();
        String[] Mahasiswa = {"Naruto", "Sasuke", "Sakura","Kakashi"};
        String[] Nim = {"D0223325", "D0223326", "D0223327","D0223328"};
        for (int i = 0; i < Mahasiswa.length; i++) {
            for (int j = 0; j < Nim.length; j++) {
                data1.put(Mahasiswa[i], Nim[i]);
                data1.remove(Mahasiswa[3], Nim[3]);
            }
        }
        System.out.println(data1);
    }
}
