package jobsheet2;

public class TestPeminjamanGame {
    public static void main(String[] args) {
        System.out.println("data peminjaman game");
        PeminjamanGame member1 = new PeminjamanGame();
        member1.namaMember = "rozak";
        member1.id= 101;
        member1.namaGame = "PES 2024";
        member1.hargaPerHari=5000;
        member1.lamaSewa = 3;
        member1.tampilData();
    }
}
