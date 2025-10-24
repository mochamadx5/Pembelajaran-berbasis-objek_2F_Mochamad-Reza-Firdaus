package jobsheet9.abstractclass.interfacelatihan;

public class Mahasiswa implements ICumlaude {
    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public void kuliahDiKampus() {
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulus() {
        System.out.println(nama + " telah menyelesaikan studinya dengan baik.");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println(nama + " meraih IPK tinggi dan dinyatakan cumlaude!");
    }
}
