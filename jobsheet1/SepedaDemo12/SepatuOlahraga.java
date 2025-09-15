public class SepatuOlahraga extends Sepatu {
    String jenisOlahraga;
    String warna;

    void kegiatan() {
        System.out.println("Sepatu " + merk + " dipakai untuk olahraga");
    }
    void cetakInfo() {
        System.out.println("sepatu olahraga merk : " + merk + ", ukuran : " + ukuran
        + ", jenis " + jenisOlahraga + ", warna : " + warna);
    }
}