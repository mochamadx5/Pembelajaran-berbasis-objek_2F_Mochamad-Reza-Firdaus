package jobsheet2;

public class TestJualan {
    public static void main(String[] args) {
        System.out.println("Detail Barang");
        Jualan barang1 = new Jualan();
        barang1.kode = "B01";
        barang1.namaBarang = "Sapu";
        barang1.hargaDasar = 30000;
        barang1.diskon = 0.1f;
        barang1.tampilData();
    }
}