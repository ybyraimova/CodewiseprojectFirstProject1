package scannerClass;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
//        you type this data
        int w=10;
        int w1=5;
        int sum = w+w1;
        System.out.println(sum);

//        but scanner will help us to get this data from user:
        Scanner scanner = new Scanner(System.in); //this is syntax to remember

        System.out.println("Please enter the first number ");

        int a =scanner.nextInt();
        System.out.println("Please enter the second number");

        int b = scanner.nextInt();
        System.out.println("Please enter the third number");
        int c= scanner.nextInt();

        int mult= a*b;
        System.out.println(a + "*" + b + " = " + mult);

        int sum1 = a+b+c;
        System.out.println(a+ " " + " + " + b  + " " + " + " + c + " " + " = " + sum1 );


        System.out.println("\nNumber of breads you purchased: ");
        int bread =scanner.nextInt();

        System.out.println("The price for one piece");
        int priceOfBread= scanner.nextInt();


        System.out.println("You purchased " + bread + " breads each cost " + priceOfBread + "$"
        + ", the total price will be " + bread*priceOfBread + "$.");








    }
}
