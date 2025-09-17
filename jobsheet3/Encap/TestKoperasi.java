package jobsheet3.Encap;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPeminjaman());

        // Meminjam uang
        System.out.print("\nMasukkan nominal pinjaman pertama: ");
        double pinjam1 = input.nextDouble();
        donny.pinjam(pinjam1);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());

        System.out.print("\nMasukkan nominal pinjaman kedua: ");
        double pinjam2 = input.nextDouble();
        donny.pinjam(pinjam2);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());

        // Membayar angsuran
        System.out.print("\nMasukkan nominal angsuran pertama: ");
        double angsur1 = input.nextDouble();
        donny.angsur(angsur1);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());

        System.out.print("\nMasukkan nominal angsuran kedua: ");
        double angsur2 = input.nextDouble();
        donny.angsur(angsur2);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());

        input.close();
    }
}
