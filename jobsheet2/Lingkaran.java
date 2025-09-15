package jobsheet2;

public class Lingkaran {
    public double phi = 22.0/7;
    public double r;

    public double hitungLuas () {
        return phi * r * r;
    }
    public double hitungKeliling () {
        return 2 * phi * r;
    }
    public void tampilkanHitungan() {
        System.out.println("Keliling Lingkaran = " + hitungKeliling());
        System.out.println("Luas lingkaran = " + hitungLuas());
    }
}
