package jobsheet3.KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota ang1 = new Anggota();
        ang1.setNama("Fikri Setiawan");
        ang1.setAlamat("Jalan Uranus no 12");
        ang1.setor(100000);
        System.out.println("Simpanan " + ang1.getNama() + " : Rp " + ang1.getSimpanan());
        
        ang1.pinjam(10000);
        System.out.println("Simpanan " + ang1.getNama() + " : Rp " + ang1.getSimpanan());
    }
}
