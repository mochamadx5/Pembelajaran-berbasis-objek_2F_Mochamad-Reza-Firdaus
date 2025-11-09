package jobsheet10;

public class Plant {
    public void doDestroy(Destroyable d) {
        // Memanggil method destroyed() secara polimorfik
        d.destroyed();
    }
}