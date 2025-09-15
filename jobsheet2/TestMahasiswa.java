package jobsheet2;

public class TestMahasiswa {
    public static void main(String[] args) {
        
        //instansiasi mahasiswa 1
        System.out.println("biodata mahasiswa 1");
        Mahasiswa mhs1=new Mahasiswa();
        mhs1.nim =101;
        mhs1.nama ="lestari";
        mhs1.alamat ="jl. vinolia 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        
        
        //instansiasi mahasiswa 2 
        System.out.println("biodata mahasiswa 2");
        Mahasiswa mhs2=new Mahasiswa();
        mhs2.nim =102;
        mhs2.nama ="yudha";
        mhs2.alamat ="jl. anggrek 67";
        mhs2.kelas = "1C";
        mhs2.tampilBiodata();
    }
}
