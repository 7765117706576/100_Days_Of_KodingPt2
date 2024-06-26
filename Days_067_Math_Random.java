package OHY;

public class Day_059_Math_Random {
    public static void main(String[] args) {
        int awal = 5;
        int akhir = 25;
        int bil_Random = awal + (int)(Math.random()*((akhir-awal)+1));
        System.out.println(bil_Random);
    }
}
