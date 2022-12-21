package loops;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        /*
        ask user to enter integers. Two numbers should be added, and you need to print out sum of 2 numbers.
        the loop should ask user if he wants to perform this operation again. if true, again get 2 numbers and display
        the sum. ask again until the false.
         */

//        first create scanner:
        Scanner user = new Scanner(System.in);

//        create loop

        boolean answer; //create boolean to have the value
        do {
            //        create 1 var and ask user
            System.out.println("Enter first number");
            int a = user.nextInt();

//        create var 2 and ask user
            System.out.println("Enter second number");
            int b = user.nextInt();

//            this will print the result for user
            System.out.println(a+b);
            System.out.println("Do you want to try again? true/false");
            answer = user.nextBoolean();
        }while(answer);

    }
}
