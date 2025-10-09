package jobsheet4.reza_relasiclass_percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi; // Array objek Kursi

    // Method initKursi() 
    private void initKursi() { 
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    // f. Constructor Gerbong
    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi(); 
    }

    // Setter dan Getter
    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }
    
    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }
    
    // Method setPenumpang()
    public void setPenumpang(Penumpang penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }

    // Method info()
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n"; 
        // Loop for-each untuk menampilkan info setiap kursi dalam array
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}