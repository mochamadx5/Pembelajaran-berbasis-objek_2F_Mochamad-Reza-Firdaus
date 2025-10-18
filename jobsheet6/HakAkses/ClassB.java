package HakAkses;

public class ClassB extends ClassA {
    private int z;

    public void setZ(int Z) {
        this.z = Z;
    }
    public void getNilaiZ() {
        System.out.println("nilai Z : " + z);
    }
    public void getJumlah() {
        System.out.println("jumlah : " + (getX() + getY() + z));
    }
}