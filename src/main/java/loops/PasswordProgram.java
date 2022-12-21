package loops;

import java.util.Scanner;

public class PasswordProgram {
    public static void main(String[] args) {
        String title = "Computer";
        char firstLetter = title.charAt(0);
        System.out.println(firstLetter);
        char lastLetter = title.charAt(title.length() - 1);
        System.out.println(lastLetter);
        System.out.println("\n");


        print("Zizek Kobanovszki");
        print("");
        print("Dora");
        System.out.println("\n");
        giveNumber(-29);

        giveNumber(0);
        giveNumber(7);

        check(321);


        Scanner user = new Scanner(System.in);
        String sample = "Qwerty&1";


        String specialCharacters = "!@#$%^&*()_+=[]{}<>?/ ;:";
        String integers = "1234567890";
//        !password.contains(specialCharacters) && !password.contains(integers)
//        "Your password must contain at least one integer" +
//                "Your password must contain at least one special character");
        int maxAttempts = 3;
        int attempts = 0;


        while (true) {
            System.out.println("Please enter your password:");
            String password = user.nextLine();
            if (password.equals(sample)) {
                System.out.println("Log in is successful");

                break;

            } else {
                System.out.println("Wrong password. Try again");
                attempts++;
            }
            if (attempts == maxAttempts) {
                System.out.println("Max attempts reached. Try again after 24 hours");
                break;
            }

        }

    }

    public static void check(int num) {
        if (num % 2 == 0) {
            for (int i = 1; i <= 30; i++) {
                System.out.println(i + ") Hi");
            }
        } else {
            for (int i = 1; i <= 30; i++) {
                System.out.println(i + ") Hello");
            }
        }


    }


    public static void giveNumber(int num) {
        if (num > -1) {
            for (int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Please enter the positive number");
        }
    }


    public static void print(String str) {
        if (!str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        } else {
            System.out.println("Invalid word. String cannot be empty");
        }


    }
}










        /*
        1. create a real password and it somewhere;
        2. create scanner;
        3. create a variable password with next line so the user can enter
        4. create do -while condition to check whether the entered password matches the conditions.
        do {
        if (!password.length().equals(8)){
            sout("Your password must be at least characters); --> if not keep running the loop

            else if (!password.contains(1,2,3,4,5,6,7,8,9,0){ --> if not keep running the loop
            sout("Your password must contain at least one integer");

            else if(!password.contains(!,@,#,$,%,^,&,*,(,),-,_,+,?,/,',;,[,],{,},|,\){--> if not keep running the loop
            sout("Your password must contain at least one special character");

            }else{ stop lop

         */
