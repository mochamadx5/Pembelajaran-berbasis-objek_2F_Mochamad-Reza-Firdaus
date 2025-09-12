public class SepedaDemo {
    public static void main(String[] args) {
        
        // buat dua buah objek sepeda
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();

        // panggil method di dalam objekk sepeda
        spd1.setMerek("polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();

        spd1.setMerek("Win cycle");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.tambahKecepatan(10);
        spd1.gantiGear(3);
        spd1.cetakStatus();
    }
}
