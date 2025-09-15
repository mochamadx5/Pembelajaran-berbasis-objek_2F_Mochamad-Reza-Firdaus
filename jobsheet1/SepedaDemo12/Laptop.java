public class Laptop {
    String merk;
    int ram;

    void hidupkan() {
        System.out.println("Laptop " + merk + " menyala");
    }
     void matikan() {
        System.out.println("Laptop " + merk + " dimatikan");
    }
    void cetakInfo() {
        System.out.println("Laptop " + merk + " RAM : " + ram + "GB");
    }
}