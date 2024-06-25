package OHY;

public class Day_058_Segitiga_sama_kaki {
public static void segitiga_samakaki(){
    short height = 5;
    for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        segitiga_samakaki();
    }
}
   


