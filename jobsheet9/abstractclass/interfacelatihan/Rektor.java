package jobsheet9.abstractclass.interfacelatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("saya rektor, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Silakan perkenalkan diri anda.");

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("-------------------------------------------");
    }
    
}
