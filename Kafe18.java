import java.util.Scanner;

public class Kafe18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f; 

        // input
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();

        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();

        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();

        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        // total harga tanpa diskon
        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        // harga akhir dengan diskon 
        double nominalBayar = totalHarga - (diskon * totalHarga);

        // casting
        int nominalInt = (int) nominalBayar;
        byte totalByte = (byte) totalHarga;

        // output
        System.out.println("Keanggotaan pelanggan: " + keanggotaan);
        System.out.println("Item pembelian: " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal bayar: Rp " + nominalBayar);
        System.out.println("Nominal bayar dalam bentuk int: Rp " + nominalInt);
        System.out.println("Total harga dalam bentuk byte: " + totalByte);
        
        
        input.close();
    }
}
