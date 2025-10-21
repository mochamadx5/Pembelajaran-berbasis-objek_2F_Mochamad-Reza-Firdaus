package jobsheet7.tugas2;

public class Demo {
    
    public static void main(String[] args) {
        
        Manusia orang1; 
        System.out.println("--- Dynamic Method Dispatch Demonstration ---");
        
        orang1 = new Dosen(); 
        
        System.out.print("Saat orang1 = new Dosen(): ");
        orang1.makan(); 
        orang1.bernafas(); 
        
        System.out.println("---------------------------------------------");
        orang1 = new Mahasiswa(); 
        
        System.out.print("Saat orang1 = new Mahasiswa(): ");
        orang1.makan(); 
        orang1.bernafas(); 
    }
}