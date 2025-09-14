public class TugasPraktikum {
    public static void main(String[] args) {
        
        // instansiasi laptop
        Laptop laptop1 = new Laptop();
        laptop1.merk = "lenovo";
        laptop1.ram = 8;
        laptop1.hidupkan();
        laptop1.matikan();
        laptop1.cetakInfo();

        //instansi sepatu olahraga
        SepatuOlahraga sport1 = new SepatuOlahraga();
        sport1.merk = "ortuseight";
        sport1.ukuran = 41;
        sport1.jenisOlahraga = "lari";
        sport1.kegiatan();
        sport1.warna = "merah";
        sport1.cetakInfo();
    
        //instansi sepatu formal
        SepatuFormal formal1 = new SepatuFormal();
        formal1.merk = "bata";
        formal1.ukuran = 42;
        formal1.bahan = "kulit";
        formal1.bahan();
        formal1.warna = "hitam";
        formal1.cetakInfo();
    }
}
