package jobsheet3.motorEncapsulation;

    public class Motor{

        private int kecepatan = 0;
        private boolean kontakOn = false;
        private final int max_kecepatan=100;
        
        public void nyalakanMesin() {
            kontakOn=true;
        }
        public void matikanMesin() {
            kontakOn = false;
            kecepatan = 0;
        }
        public void tambahKecepatan() {
            if (kontakOn == true) {
                if (kecepatan + 10 <= max_kecepatan) {
                    kecepatan += 10;
                } else {
                    kecepatan=max_kecepatan;
                    System.out.println("kecepatan sudah maksimal! (" + max_kecepatan + ")\n");
                }
            } else {
                System.out.println("kecepatan tidak bisa bertambah karena mesin off! \n");
            }
        }
        public void kurangiKecepatan () {
            if (kontakOn == true) {
                kecepatan -= 5;
            } else {
                System.out.println("Kecepatan tidak bisa berkurang karena mesin Off! \n");
            }
        }
        public void printStatus () {
            if (kontakOn == true) {
                System.out.println("kontak on");
            }
            else{
                System.out.println("kontak off");
            }
            System.out.println("kecepatan " + kecepatan+"\n");
        }
}
    

