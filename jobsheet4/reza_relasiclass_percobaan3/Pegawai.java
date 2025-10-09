package jobsheet4.reza_relasiclass_percobaan3;

public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Nip: " + this.nip + "\n \n";
        return info;
    }
    
    // (Getter dan Setter lainnya dihilangkan untuk kode singkat, namun ada di implementasi penuh)
}