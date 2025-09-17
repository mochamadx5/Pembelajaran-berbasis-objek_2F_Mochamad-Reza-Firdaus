package jobsheet3.Encap;

public class Anggota {
    private String nik;
    private String nama;
    private double limitPeminjaman;
    private double jumlahPeminjaman;

    public Anggota(String nik, String nama, double limitPeminjaman) {
        this.nik = nik;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPeminjaman = 0;
    }
    public String getNama() {
        return nama;
    }
    public void setNik (String nik) {
        this.nik = nik;
    }
    public double getLimitPeminjaman() {
        return limitPeminjaman;
    }
    public double getJumlahPeminjaman() {
        return jumlahPeminjaman;
    }
    public void pinjam(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal pinjaman harus lebih dari 0.");
        } else if (jumlahPeminjaman + nominal > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPeminjaman += nominal;
            System.out.println(nama + " berhasil meminjam Rp " + nominal);
        }
    }
    public void angsur(double nominal) {
        if (jumlahPeminjaman == 0) {
           System.out.println("Tidak ada pinjaman untuk diangsur.");
        } else if (nominal <= 0) {
            System.out.println("Nominal angsuran harus > 0");
        } else if (nominal < 0.1 * jumlahPeminjaman) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman.");
        } else if (nominal >= jumlahPeminjaman) {
            jumlahPeminjaman = 0;
            System.out.println(nama + " membayar lunas pinjaman");
        } else {
            jumlahPeminjaman -= nominal;
            System.out.println(nama + " berhasil mengangsur Rp " + nominal);
        }
    }
}