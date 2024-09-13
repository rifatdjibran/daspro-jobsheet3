import java.util.Scanner;

public class Siakad18 {
    public static void main(String[] args) {
        
        // scanner
        Scanner sc = new Scanner(System.in);
        
        // variabel
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        // data mahasiswa
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();

        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();

        System.out.print("Masukkan Kelas: ");
        kelas = sc.next().charAt(0);

        System.out.print("Masukkan Nomor Absen: ");
        absen = sc.nextByte();

        // nilai
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();

        System.out.print("Masukkan Nilai Ujian: ");
        nilaiUjian = sc.nextDouble();

        // hitung nilai akhir
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        // tampilan 
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Absen: " + absen);
        System.out.println("Mahasiswa dengan Nama " + nama + " ( NIM "+ nim + ")" + " kelas " + kelas + " absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        
        sc.close();
    }
}
