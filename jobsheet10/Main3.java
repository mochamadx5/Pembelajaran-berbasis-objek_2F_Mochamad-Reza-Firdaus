package jobsheet10;

public class Main3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "R-1"); // Menggunakan R-1 agar logis
        
        Employee e[] = {pEmp, iEmp}; //
        Payable p[] = {pEmp, eBill}; //
        
        // Employee e2[] = {pEmp, iEmp, eBill}; // Baris ini akan error
    }
}