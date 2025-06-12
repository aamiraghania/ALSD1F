import java.util.ArrayList;
import java.util.Collections;

public class Sorting01 {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);
        
        System.out.println(daftarSiswa);

        ArrayList<Customer01> customers = new ArrayList<>();
        customers.add(new Customer01(2, "Zara"));
        customers.add(new Customer01(1, "Andi"));
        customers.add(new Customer01(3, "Rudi"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}