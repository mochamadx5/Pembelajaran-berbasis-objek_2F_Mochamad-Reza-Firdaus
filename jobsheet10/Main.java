package jobsheet10;

public class Main {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500); 
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5); 
        ElectricityBill eBill = new ElectricityBill(5, "R-1"); 
        Employee e; 
        Payable p;
        
        // assignment biasa
        e = pEmp; 
        e = iEmp; 
        
        p = pEmp; 
        p = eBill;

        // tampilkan hasilnya
        System.out.println("=== Employee Info ===");
        System.out.println(pEmp.getEmployeeInfo());
        System.out.println(iEmp.getEmployeeInfo());

        System.out.println("=== Payable Info ===");
        System.out.println("Permanent Employee payment: " + pEmp.getPaymentAmount());
        System.out.println("Electricity Bill payment: " + eBill.getPaymentAmount());
    }
}
