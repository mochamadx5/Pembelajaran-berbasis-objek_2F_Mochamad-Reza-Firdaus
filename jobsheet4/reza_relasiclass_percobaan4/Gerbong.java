package jobsheet4.reza_relasiclass_percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi; // Array objek Kursi

    // Method untuk inisialisasi semua kursi
    private void initKursi() { 
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    // Constructor Gerbong
    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah]; // Alokasi memori array
        this.initKursi(); // Panggil method untuk mengisi array
    }

    // Getter dan Setter
    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }
    
    // METHOD setPenumpang()
    public void setPenumpang(Penumpang penumpang, int nomor) {
        int indeks = nomor - 1; 
        if (indeks < 0 || indeks >= arrayKursi.length) {
            System.out.println("ERROR: Nomor kursi " + nomor + " tidak ada dalam gerbong ini!");
            return;
        }

        // Cek apakah kursi sudah terisi
        if (this.arrayKursi[indeks].getPenumpang() == null) {
            // Jika kursi KOSONG, set penumpang
            this.arrayKursi[indeks].setPenumpang(penumpang);
            System.out.println("Penumpang " + penumpang.getNama() + " berhasil duduk di kursi " + nomor);
        } else {
            // Jika kursi SUDAH TERISI, berikan pesan error
            System.out.println("ERROR: Kursi nomor " + nomor + " sudah terisi oleh penumpang lain!");
        }
    }

    // Method info()
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}