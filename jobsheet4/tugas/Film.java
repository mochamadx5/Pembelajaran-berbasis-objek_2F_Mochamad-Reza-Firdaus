package jobsheet4.tugas;

public class Film {
    private String judul;
    private int durasi;
    private Sutradara sutradara; 
    
    public Film(String judul, int durasi, Sutradara sutradara) {
        this.judul = judul;
        this.durasi = durasi;
        this.sutradara = sutradara;
    }

    public String getJudul() {
        return judul;
    }

    public int getDurasi() {
        return durasi;
    }

    public Sutradara getSutradara() {
        return sutradara;
    }

    public String info() {
        String info = "";
        info += "Judul Film: " + this.judul + "\n";
        info += "Durasi: " + this.durasi + " menit\n";
        info += "--- Detail Sutradara ---\n";
        info += this.sutradara.info(); // Memanggil info() dari objek Sutradara
        return info;
    }
}