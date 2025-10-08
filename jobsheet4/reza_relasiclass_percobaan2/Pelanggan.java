package jobsheet4.reza_relasiclass_percobaan2;

public class Pelanggan {
    
    private String nama;
    private Mobil mobil; 
    private Sopir sopir; 
    private int hari;

    public Pelanggan() {
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public int getHari() {
        return hari;
    }

    // Method hitungBiayaTotal
    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) +
        sopir.hitungBiayaSopir(hari);
    }
}