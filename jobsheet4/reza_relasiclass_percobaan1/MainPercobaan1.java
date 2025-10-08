package jobsheet4.reza_relasiclass_percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
       Processor p = new Processor("intel i5", 3); 

       Laptop L = new Laptop("Thinkpad", p);

       L.info();
       
       Processor p1 = new Processor(); 
       p1.setMerk("Intel i5");
       p1.setCache(4); 
       Laptop L1 = new Laptop("Thinkpad", new Processor("Intel i5", 3));
       L1.setMerk("Thinkpad");
       L1.setProc(p1);

       L1.info();
    }
}
