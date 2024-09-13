import java.util.Scanner;

public class Siakad18 {
    public static void main(String[] args) {
        
        // scanner
        Scanner sc = new Scanner(System.in);
        
        // variabel
        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        // data mahasiswa
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();

        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();

        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine();

        System.out.print("Masukkan Nomor Absen: ");
        absen = sc.nextByte();

        // nilai
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        // hitung nilai akhir berdasarkan bobot yang diberikan
        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);

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
