package jobsheet4.reza_relasiclass_percobaan3;

public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten; 

    // Constructor 3 parameter (asisten = null)
    public KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    // Constructor 4 parameter
    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }
    
    // (Getter dan Setter lainnya dihilangkan)

    // Method info() dengan PERBAIKAN untuk mencegah NullPointerException
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n \n";
        info += "===== Masinis ===== \n" + this.masinis.info(); 

        // PENGECEKAN NULL: Jika asisten ada, panggil info(), jika tidak, berikan pesan.
        if (this.asisten != null) { 
            info += "===== Asisten ===== \n" + this.asisten.info();
        } else {
            info += "Asisten: (Belum ditugaskan)\n"; 
        }
        
        return info;
    }
}