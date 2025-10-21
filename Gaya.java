package PBO4_PRAKTIKUM_IFB24_Tugas3;
import java.util.Scanner;
public class Gaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan massa (kg): ");
        double m = sc.nextDouble();
        System.out.print("Masukkan kecepatan (m/s): ");
        double v = sc.nextDouble();
        System.out.print("Masukkan jari-jari (m): ");
        double r = sc.nextDouble();

        double Fc = (m * v * v) / r;
        System.out.println("Gaya Sentripetal = " + Fc + " N");
    }

}
