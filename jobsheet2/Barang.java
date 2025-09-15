package jobsheet2;

public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;

    public void tampilBarang() {
        System.out.println("nama barang " + namaBrg);
        System.out.println("jenis barang : " + jenisBrg);
        System.out.println("Stok : " +stok);
    }
    //method argumen dan nilai balik (return)
    public int tambahStok(int brgMasuk) {
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
