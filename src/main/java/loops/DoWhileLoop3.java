package loops;

import java.util.Scanner;

public class DoWhileLoop3 {
    public static void main(String[] args) {
        /*
        ask user to input 1 number
        asker user to input arithmetic operator
        ask user to input 2 number
        return the result
        ask user if he wants to try again: true or false
        if true --> keep going until false
         */
        Scanner user = new Scanner(System.in);
        boolean answer;


        do {
            System.out.println("Please enter first number");
            int a = user.nextInt();
            System.out.println("Please enter arithmetic operator");
            String x = user.next();
            System.out.println("Please enter second number");
            int b = user.nextInt();

            if (x.equals("+")) {
                System.out.println(a + " + " + b + " = " + (a + b));
            }
            if (x.equals("-")) {
                System.out.println(a + " - " + b + " = " + (a - b));
            }
            if (x.equals("/")) {
                System.out.println(a + " / " + b + " = " + (a / b));
            }
            if (x.equals("*") || x.equals("x")) {
                System.out.println(a + " * " + b + " = " + (a * b));
            }
            System.out.println("Do you want to try again? true/false");
            answer = user.nextBoolean();

        } while (answer);
    }
}
