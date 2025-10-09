package jobsheet4.tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        Sutradara s1 = new Sutradara("Christopher Nolan", 55);
        Sutradara s2 = new Sutradara("Greta Gerwig", 40);

        // Buat Objek Film (Memiliki relasi dengan Sutradara)
        Film f1 = new Film("Inception", 148, s1);
        Film f2 = new Film("Barbie", 114, s2);
        Film f3 = new Film("Oppenheimer", 180, s1);

        // Buat Objek Bioskop (Memiliki relasi array dengan Film)
        Bioskop cinemaxx = new Bioskop("Cinemaxx Malang", 5);

        // Tambahkan Film ke Bioskop
        cinemaxx.tambahFilm(f1);
        cinemaxx.tambahFilm(f2);
        cinemaxx.tambahFilm(f3);

        System.out.println(cinemaxx.info());
        
        Pembeli p1 = new Pembeli("Reza", "08123456789");
        System.out.println("--- Pembeli Hari Ini ---");
        System.out.println(p1.info());
        
        System.out.println("Film yang dibeli Reza: " + f1.getJudul());
    }
}