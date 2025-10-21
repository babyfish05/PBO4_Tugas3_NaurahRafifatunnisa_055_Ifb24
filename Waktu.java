package PBO4_PRAKTIKUM_IFB24_Tugas3;
import java.util.Scanner;
public class Waktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan waktu pertama (jam): ");
        int jam1 = sc.nextInt();
        System.out.print("Masukkan waktu kedua (jam): ");
        int jam2 = sc.nextInt();

        int selisih = Math.abs(jam2 - jam1);
        System.out.println("Selisih waktu: " + selisih + " jam");
    }
}
