package jobsheet4.reza_relasiclass_percobaan3;

public class Pegawai {

    private String nip;
    private String nama;

    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // method info()
    public String info() {
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "NIP : " + this.nip + "\n";
        return info;
    }
}