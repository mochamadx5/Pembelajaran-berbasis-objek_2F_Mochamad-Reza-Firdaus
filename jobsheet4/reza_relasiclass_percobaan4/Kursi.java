package jobsheet4.reza_relasiclass_percobaan4;

public class Kursi {
    private String nomor;
    private Penumpang penumpang; // Relasi dengan Penumpang

    public Kursi(String nomor) {
        this.nomor = nomor;
    }
    // Setter
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    // Setter relasi: Penumpang menempati Kursi
    public void setPenumpang(Penumpang penumpang) { 
        this.penumpang = penumpang;
    }

    // Getter
    public String getNomor() {
        return nomor;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    // d. Method info()
    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        
        // Pengecekan null
        if (this.penumpang != null) { 
            info += "Penumpang: \n" + penumpang.info() + "\n";
        }
        return info;
    }
}