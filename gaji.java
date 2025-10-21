package PBO4_PRAKTIKUM_IFB24_Tugas3;
import java.util.Scanner;
public class gaji {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Jabatan: ");
        String jabatan = input.nextLine();

        double gajiPokok = 2000000;
        double tjJabatan = 300000;
        double tjIstri = 200000;
        double tjAnak = 150000;

        double totalGaji = gajiPokok + tjJabatan + tjIstri + tjAnak;
        double pajak = 0.1 * totalGaji;
        double gajiBersih = totalGaji - pajak;

        System.out.println("\nTotal Gaji : " + totalGaji);
        System.out.println("Pajak 10% : " + pajak);
        System.out.println("Gaji Bersih : " + gajiBersih);
    }
}
