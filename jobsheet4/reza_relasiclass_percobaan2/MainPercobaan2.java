package jobsheet4.reza_relasiclass_percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
        
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);

        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);

        Pelanggan p = new Pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m);    
        p.setSopir(s);    
        p.setHari(2);     

        System.out.println("Merk Mobil: " + m.getMerk());
        System.out.println("Nama Sopir: " + s.getNama());
        System.out.println("Lama Sewa: " + p.getHari() + " hari");
        System.out.println("Biaya Sewa Mobil per hari: " + m.getBiaya());
        System.out.println("Biaya Sopir per hari: " + s.getBiaya());
        
        System.out.println("Biaya Total = " + p.hitungBiayaTotal());  
        System.out.println(p.getMobil().getMerk());   
    }
}