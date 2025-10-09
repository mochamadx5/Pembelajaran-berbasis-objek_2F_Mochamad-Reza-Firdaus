package jobsheet4.tugas;

public class Bioskop {
    private String nama;
    private Film[] daftarFilm;
    private int indeksFilm = 0;
    
    public Bioskop(String nama, int jumlahFilm) {
        this.nama = nama;
        this.daftarFilm = new Film[jumlahFilm]; 
    }

    // Method untuk menambah film ke array
    public void tambahFilm(Film film) {
        if (indeksFilm < daftarFilm.length) {
            this.daftarFilm[indeksFilm] = film;
            indeksFilm++;
        } else {
            System.out.println("Bioskop sudah penuh, tidak bisa menambah film lagi.");
        }
    }

    public String info() {
        String info = "";
        info += "========================================\n";
        info += "Bioskop: " + this.nama + "\n";
        info += "Total Kapasitas Film: " + this.daftarFilm.length + "\n";
        info += "========================================\n";

        // Iterasi melalui array daftarFilm
        for (int i = 0; i < daftarFilm.length; i++) {
            if (daftarFilm[i] != null) {
                info += "Slot " + (i + 1) + ":\n";
                info += daftarFilm[i].info();
                info += "----------------------------------------\n";
            }
        }
        return info;
    }
}