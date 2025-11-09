package jobsheet10;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) { 
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        // Nama method 'destroyed' agar sesuai interface 
        // Logika disimpulkan dari output 64, yaitu pengurangan 10% (dibulatkan ke bawah)
        this.strength = (int) (this.strength * 0.9);
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength;
    }
}