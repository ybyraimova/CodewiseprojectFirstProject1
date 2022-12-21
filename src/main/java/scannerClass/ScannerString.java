package scannerClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("What is the product name: ");
        String brandName = sc.nextLine();
        System.out.println("What is the price: ");
        double price = sc.nextDouble();

        System.out.println("What is the quantity: ");
        int q =sc.nextInt();

        System.out.println("\n" + brandName + " " + price + "$" + " " + q +
                " " + price*q + "$");









    }
}
