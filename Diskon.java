package PBO4_PRAKTIKUM_IFB24_Tugas3;
 import java.util.Scanner;
public class Diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Total Belanja: ");
        double total = input.nextDouble();

        System.out.print("Diskon (%): ");
        double diskon = input.nextDouble();

        double totalBayar = total - (total * diskon / 100);

        System.out.println("\nNama: " + nama);
        System.out.println("Total Bayar: " + totalBayar);
    
}
}
