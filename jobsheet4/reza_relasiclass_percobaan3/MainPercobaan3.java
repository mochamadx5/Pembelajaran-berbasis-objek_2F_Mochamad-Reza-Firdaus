package jobsheet4.reza_relasiclass_percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        // n. Buat objek Pegawai untuk Masinis
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");

        // n. Buat objek Pegawai untuk Asisten
        Pegawai asisten = new Pegawai("4567", "Patrick Star"); 

        // n. Buat objek KeretaApi menggunakan constructor 4 parameter
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);

        // n. Tampilkan informasi kereta api
        System.out.println(keretaApi.info());
    }
}