package jobsheet2;

public class Jualan {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public double hitungHargaJual() {
        return hargaDasar - (diskon * hargaDasar);
    }
    public void tampilData () {
        System.out.println("kode barang : " + kode);
        System.out.println("nama barang : " + namaBarang );
        System.out.println("Harga dasar : " + hargaDasar);
        System.out.println("diskon : " + diskon);
        System.out.println("harga jual " + hitungHargaJual());
    }
}