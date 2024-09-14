import java.util.Scanner;

public class Listrik18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //(untuk memanggil scanner)

        int jmlListrik; //(memberikan tipe data int pada variabel jmlListrik)
        double hargaListrik = 1500.0, totalHargaListrik;//(memberikan nilai variabel hargaListrik dan totalHargaListrik dengan tipe data double)
        boolean statusTagihan;//(memberikan tipe data boolean pada variabel statusTagihan)

        // input
        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");//(menampilkan inputan untuk memasukkan nilai yang diinginkan)
        jmlListrik = input.nextInt();//(mengisi value variabel)

        // total harga listrik
        totalHargaListrik = jmlListrik * hargaListrik;//(untuk menghitung rumus total harga listrik)

        statusTagihan = jmlListrik > 500;//(melakukan pengecekan apakah melebihi dari nilai yang tertera)

        // output
        System.out.println("Apakah Penggunaan listrik lebih dari 500 kWh? : " + statusTagihan);//(menampilkan apakah listrik lebih atau tidak)
        System.out.println("Total tagihan listrik: Rp " + totalHargaListrik);//(menampilkan hasil total tagihan)

        input.close();//(menutup scanner)
    }
}
