package jobsheet7.tugas;
import static java.lang.Math.sqrt;

public class Segitiga {
    private int sudut;
    /**
     * Finds the sum of the other two angles in a triangle (180 - one angle).
     *
     * @param sudutA The first known angle.
     * @return The sum of the remaining two angles.
     */
    public int totalSudut(int sudutA) {

        this.sudut = 180 - sudutA;
        return this.sudut;
    }

    /**
     * @param sudutA The first known angle.
     * @param sudutB The second known angle.
     * @return The value of the third angle.
     */
    public int totalSudut(int sudutA, int sudutB) {
        this.sudut = 180 - (sudutA + sudutB);
        return this.sudut;
    }


    // --- Overloaded keliling methods ---

    /**
     * @param sisiA Length of side A.
     * @param sisiB Length of side B.
     * @param sisiC Length of side C.
     * @return The perimeter as an integer.
     */
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    /**
     * @param sisiA Length of the first leg (a).
     * @param sisiB Length of the second leg (b).
     * @return The perimeter (keliling) as a double.
     */
    public double keliling(int sisiA, int sisiB) {
        double sisiC = sqrt((double) (sisiA * sisiA) + (sisiB * sisiB));
        
        return sisiA + sisiB + sisiC;
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("--- totalSudut Overloading ---");
        System.out.println("totalSudut(40) = " + s.totalSudut(40)); // Output: 140
        System.out.println("totalSudut(40, 60) = " + s.totalSudut(40, 60)); // Output: 80

        System.out.println("\n--- keliling Overloading ---");
        System.out.println("keliling(5, 6, 7) = " + s.keliling(5, 6, 7)); // Output: 18
        System.out.println("keliling(3, 4) = " + s.keliling(3, 4)); // Output: 12.0 (3+4+5)
    }
}