package PBO4_PRAKTIKUM_IFB24_Tugas3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Perbedaan {
    public static void main(String[] args) throws IOException {
        // --- Scanner ---
        Scanner sc = new Scanner(System.in);
        System.out.print("Input dengan Scanner: ");
        String dataScanner = sc.nextLine();

        // --- BufferedReader ---
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input dengan BufferedReader: ");
        String dataBuffered = br.readLine();

        System.out.println("\nHasil Scanner: " + dataScanner);
        System.out.println("Hasil BufferedReader: " + dataBuffered);
    }
}
