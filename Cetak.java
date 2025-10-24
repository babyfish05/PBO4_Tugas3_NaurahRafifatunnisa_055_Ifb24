package PBO4_PRAKTIKUM_IFB24_Tugas3;
 import java.util.Scanner;
public class Cetak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah novel dan tebal novel (lembar)
        System.out.print("Masukkan jumlah novel yang akan dicetak: ");
        int jumlahNovel = input.nextInt();

        System.out.print("Masukkan jumlah lembar per novel: ");
        int lembarPerNovel = input.nextInt();

        // Misal waktu mencetak satu lembar adalah 5 detik
        int waktuPerLembar = 5;

        // Hitung total waktu dalam detik
        int totalDetik = jumlahNovel * lembarPerNovel * waktuPerLembar;

        // Konversi ke menit, jam, hari
        double totalMenit = (double) totalDetik / 60;
        double totalJam = (double) totalDetik / 3600;
        double totalHari = (double) totalDetik / 86400;

        // Tampilkan hasil
        System.out.println("\n=== HASIL PERHITUNGAN WAKTU CETAK ===");
        System.out.println("Total waktu mencetak: " + totalDetik + " detik");
        System.out.printf("Atau setara dengan: %.2f menit\n", totalMenit);
        System.out.printf("Atau setara dengan: %.2f jam\n", totalJam);
        System.out.printf("Atau setara dengan: %.4f hari\n", totalHari);

        input.close();
    }
}
 