import java.util.Scanner;

public class Gaji18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // (untuk memanggil scanner)

        int jamKerja; // variabel jam kerja karyawan
        double upahPerJam, gajiSebelumPajak, bonus, pajak, gajiSetelahPajak; // (variabel upah dan perhitungan gaji)

        // input
        System.out.print("Masukkan jumlah jam kerja: ");// (inputan untuk mengisi jumlah jam kerja)
        jamKerja = input.nextInt(); // (mengisi value variabel jamKerja)

        System.out.print("Masukkan upah per jam: Rp. ");// (inputan untuk mengisi upah perjam)
        upahPerJam = input.nextDouble(); // (mengisi value variabel upahPerJam)

        // perhitungan
        gajiSebelumPajak = jamKerja * upahPerJam; // (menghitung gaji sebelum pajak)
        bonus = 0.10 * gajiSebelumPajak; // (menghitung bonus)
        pajak = 0.05 * (gajiSebelumPajak + bonus); // (menghitung pajak)
        gajiSetelahPajak = (gajiSebelumPajak + bonus) - pajak; // (menghitung gaji setelah dikurangi pajak)

        // output
        System.out.println("Bonus yang diterima: Rp. " + bonus); // (menampilkan bonus)
        System.out.println("Pajak yang dikenakan: Rp. " + pajak); // (menampilkan pajak)
        System.out.println("Total gaji setelah pajak: Rp. " + gajiSetelahPajak); // (menampilkan total gaji setelah pajak)

        input.close(); // (menutup scanner)
    }
}
