package jobsheet4.tugas;

public class Sutradara {
    private String nama;
    private int umur;

    public Sutradara(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String info() {
        String info = "";
        info += "Nama Sutradara: " + this.nama + "\n";
        info += "Umur: " + this.umur + " tahun\n";
        return info;
    }
}