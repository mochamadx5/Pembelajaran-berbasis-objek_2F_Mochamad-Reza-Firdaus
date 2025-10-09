package jobsheet4.tugas;

public class Pembeli {
    private String nama;
    private String telepon;

    public Pembeli(String nama, String telepon) {
        this.nama = nama;
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public String info() {
        String info = "";
        info += "Nama Pembeli: " + this.nama + "\n";
        info += "Telepon: " + this.telepon + "\n";
        return info;
    }
}