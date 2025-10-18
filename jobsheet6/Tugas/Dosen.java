package Tugas;

public class Dosen extends Pegawai {
    private int jumlahSKS;
    private final int TARIF_SKS = 50000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.jumlahSKS = 0;
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    @Override
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}