package fruits;

import java.util.Scanner;

public class Strawberry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  /*This helps to give information when the program is running
        i.e. */

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println(name + ", welcome to my program!");


        System.out.println("What is your age?");
        String age = scanner.nextLine();

        System.out.println("Your age is " + age);

        System.out.println("What is your email?");
        String email = scanner.nextLine();
        System.out.println("Your email is " + email);

        System.out.println("2+2=?");
        String a=scanner.nextLine();
        System.out.println("Your answer is " + a);





    }
}
