package jobsheet2;

public class PeminjamanGame {
    public int id;
    public String namaMember;
    public String namaGame;
    public double hargaPerHari;
    public int lamaSewa;

    public double hitungHarga() {
        return hargaPerHari * lamaSewa;
    }
    public void tampilData() {
        System.out.println("id member : " +id);
        System.out.println("nama member : " +namaMember);
        System.out.println("nama game : " + namaGame);
        System.out.println("lama sewa : " + lamaSewa + " hari");
        System.out.println("total bayar " + hitungHarga());
    }
}
