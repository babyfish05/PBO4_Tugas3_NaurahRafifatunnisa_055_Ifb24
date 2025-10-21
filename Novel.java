package PBO4_PRAKTIKUM_IFB24_Tugas3;
import java.util.Scanner;
public class Novel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah novel: ");
        int novel = sc.nextInt();

        System.out.print("Tebal per novel (lembar): ");
        int lembar = sc.nextInt();

        int totalDetik = novel * lembar;
        int hari = totalDetik / 86400;
        int sisaHari = totalDetik % 86400;

        int jam = sisaHari / 3600;
        int sisaJam = sisaHari % 3600;

        int menit = sisaJam / 60;
        int detik = sisaJam % 60;

        System.out.println("\nWaktu cetak: " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}
