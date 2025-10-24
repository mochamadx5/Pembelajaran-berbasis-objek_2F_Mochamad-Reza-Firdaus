package jobsheet9.abstractclass.interfacelatihan;

public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // Panggil method untuk MAWAPRES
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
