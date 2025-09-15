public class SepatuFormal extends Sepatu {
    String bahan;
    String warna;

    void dipakaiKerja () {
        System.out.println("Sepatu " + merk + " dipakai untuk kerja");
    }
    void bahan () {
        System.out.println("Sepatu " + merk + " terbuat dari kulit");
    }
    
    void cetakInfo() {
        System.out.println("Sepatu formal merk : " + merk + ", ukuran :" + ukuran +
        " , bahan : " + bahan + ", warna : " + warna);
    }
}
