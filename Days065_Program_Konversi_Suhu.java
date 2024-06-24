package OHY;

import java.util.Scanner;

public class Day_057_Program_Konversi_Suhu {

    public static void Konversi_Suhu() {
        Scanner input = new Scanner(System.in);

        int pil;
        System.out.println("Konversi Celcius ke dalam: \n1.Fahrenheit\n2.Kelvin\n3.Reamur");
        pil = input.nextInt();
        System.out.print("Masukkan suhu Celcius: ");
        double Celcius = input.nextDouble();
        switch (pil) {
            case 1:
                double Fahrenheit = (Celcius * 9 / 5) + 32;
                System.out.println("Suhu dalam Fahrenheit: " + Fahrenheit);
                break;
            case 2:
                double Kelvin = Celcius + 273.15;
                System.out.println("Suhu dalam Kelvin: " + Kelvin);
                break;
            case 3:
                double Reamur = Celcius * 4 / 5;
                System.out.println("Suhu dalam Reamur: " + Reamur);
        }
    }

    public static void main(String[] args) {
        Konversi_Suhu();
    }
}
