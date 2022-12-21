package mentoring;

import java.util.Random;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        String a = "Published on Feb 12, 2018 ";
        System.out.println(a.replace(", 2018", ""));

        a = a.trim();
        System.out.println(a.substring(a.length() - 4));

        Scanner scanner = new Scanner(System.in);


//    Nested if statement:
        System.out.println("Please write your message: ");
        String message = scanner.nextLine();
        if (!message.isEmpty()) {
//            we want to continue and check for the second condition
            if (message.endsWith(".")) {
                System.out.println("The message is valid");
            }
        }

        System.out.println("Please enter 3 integers: ");
        int a1 = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a1 > b && a1 > c) {
            System.out.println("max is " + a1);
        } else if (b > a1 && b > c) {
            System.out.println("max is " + b);
            
        } else if (c> a1 && c>b) {
            System.out.println("max is " + c);
        }else {
        System.out.println("They are all equal");
        }


        System.out.println("Please enter the number");
        int i= scanner.nextInt();
        if( i % 2 == 0){
            System.out.print(i + " is EVEN");
        }
        else{
            System.out.print(i + " is ODD");
        }




    }


}





