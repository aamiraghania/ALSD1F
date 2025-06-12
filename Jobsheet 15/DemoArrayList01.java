import java.util.ArrayList;

public class DemoArrayList01 {
    public static void main(String[] args) {
        ArrayList<Customer01> customers = new ArrayList<>();

        Customer01 customer1 = new Customer01(1, "Zakia");
        Customer01 customer2 = new Customer01(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer01(4, "Cica"));
        customers.add(2, new Customer01(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer01 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<Customer01> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer01(201, "Della"));
        newCustomers.add(new Customer01(202, "Victor"));
        newCustomers.add(new Customer01(202, "Victor"));  

        customers.addAll(newCustomers);

        for (Customer01 cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);
    }
}