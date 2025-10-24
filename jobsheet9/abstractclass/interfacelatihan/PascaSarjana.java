package jobsheet9.abstractclass.interfacelatihan;

public class PascaSarjana extends Mahasiswa implements ICumlaude {
    public PascaSarjana(String nama){
        super(nama);
    }
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan Tesis");
    }
    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
}
