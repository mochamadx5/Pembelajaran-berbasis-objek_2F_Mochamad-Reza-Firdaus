package Tugas;

public class DaftarGaji {
    public Pegawai[] listPegawai;

    public DaftarGaji(int kapasitas) {
        listPegawai = new Pegawai[kapasitas];
    }

    private void addPegawai(Pegawai p) { // Sesuai diagram, dibuat private
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                listPegawai[i] = p;
                System.out.println("Pegawai " + p.getNama() + " berhasil ditambahkan.");
                return;
            }
        }
        System.out.println("Daftar gaji sudah penuh.");
    }
    
    private void printSemuaGaji() { // Sesuai diagram, dibuat private
        System.out.println("\n--- DAFTAR GAJI PEGAWAI ---");
        for (Pegawai p : listPegawai) {
            if (p != null) {
                
                System.out.println("Nama: " + p.getNama() + ", Gaji: Rp " + p.getGaji());
            }
        }
    }
    
    public void jalankan(Pegawai p, int sks) {
         if (p instanceof Dosen) {
             ((Dosen) p).setSKS(sks);
         }
         addPegawai(p);
    }
    public void tampilkanGaji() {
        printSemuaGaji();
    }
}