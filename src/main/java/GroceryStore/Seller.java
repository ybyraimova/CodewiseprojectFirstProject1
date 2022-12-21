package GroceryStore;

public class Seller {
        String storeName;
        String email;
        String phoneNumber;

        boolean isHalal;
        byte numberOfEmployees;


        public void display() {
                System.out.println("\nSeller's display");
                System.out.println("Full name: " + storeName);
                System.out.println("Email: " + email);
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("Number of employees: " + numberOfEmployees);
                System.out.println("Halal: " +isHalal);

        }
}
