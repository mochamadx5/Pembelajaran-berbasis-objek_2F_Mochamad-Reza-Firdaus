package jobsheet9.abstractclass.interfacelatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");

        // Casting ke Mahasiswa agar bisa panggil kuliahDiKampus()
        if (mahasiswa instanceof Mahasiswa) {
            ((Mahasiswa) mahasiswa).kuliahDiKampus();
        }

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("-------------------------------------------");
    }
}
