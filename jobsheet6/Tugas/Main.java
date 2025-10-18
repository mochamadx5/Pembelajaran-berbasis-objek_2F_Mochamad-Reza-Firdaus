package Tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(3); // Kapasitas 3 pegawai

        Dosen dosenA = new Dosen("123001", "Budi Santoso", "Jl. Mawar No. 10");
        Dosen dosenB = new Dosen("123002", "Citra Dewi", "Jl. Anggrek No. 5");

        daftar.jalankan(dosenA, 12);
        
        daftar.jalankan(dosenB, 8);
        
        daftar.tampilkanGaji();
          
    }
}