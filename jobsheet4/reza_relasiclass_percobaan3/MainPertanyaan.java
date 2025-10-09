package jobsheet4.reza_relasiclass_percobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {
        // Deklarasi Masinis
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants"); 

        // Instansiasi KeretaApi HANYA dengan 3 parameter (asisten = null)
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis); 
        
        // Memanggil info(). Karena KeretaApi sudah diperbaiki, program TIDAK CRASH.
        System.out.println(keretaApi.info());
    }
}