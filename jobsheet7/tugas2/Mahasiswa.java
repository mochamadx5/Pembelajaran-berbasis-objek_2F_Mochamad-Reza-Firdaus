package jobsheet7.tugas2;

public class Mahasiswa extends Manusia {
    
    // Overriding the makan() method
    public void makan() {
        System.out.println("Mahasiswa makan dengan cepat agar tidak terlambat kuliah.");
    }

    // New specific method for Mahasiswa
    public void tidur() {
        System.out.println("Mahasiswa tidur setelah begadang mengerjakan tugas.");
    }
}