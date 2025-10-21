package PBO4_PRAKTIKUM_IFB24_Tugas3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Buah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input data
        System.out.print("Masukkan jumlah mangga yang dibeli: ");
        int mangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah jambu yang dibeli: ");
        int jambu = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah tetangga: ");
        int tetangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah jambu yang diberikan per tetangga: ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah mangga yang busuk: ");
        int manggaBusuk = Integer.parseInt(br.readLine());

        // Proses perhitungan
        int totalMangga = mangga - manggaBusuk;
        int totalJambu = jambu - (tetangga * jambuPerTetangga);

        // Output hasil
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Total Mangga yang tersisa: " + totalMangga + " buah");
        System.out.println("Total Jambu yang tersisa: " + totalJambu + " buah");
    }
}

