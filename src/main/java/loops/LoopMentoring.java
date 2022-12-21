package loops;

import java.util.Random;

public class LoopMentoring {
    public static void main(String[] args) {

        /*
        1. Create class and main method;
        2. Generate a random number btw 0 to 100;
        3.Store that number somewhere;
        4. Write a loop that runs from 0 to 100;
        5. On each iteration check if it is equal to random number
        6.IF it is, then print the message and break the loop
        7. if not keep iterating until it finds.
         */
        Random random = new Random();
        int number = random.nextInt(101);
        System.out.println("Random  number is " + number);
        for(int i = 0; i <= 100; i++){
            if(i == number){
                System.out.println("Found Number is " + number);
                break;
            }
        }

        /*
        Write a program that prints all the numbers up tp 99 and skips 10,20,30,40:
         */
        for(int i = 0; i <=99; i++){
            if(i== 10||i==20||i==30||i==40){
                continue;
            }
            System.out.println(i);
        }
        System.out.println();

        for(int i = 0; i <=99; i++){
            if(i != 0 && i % 10 == 0){
                continue;
            }
            System.out.println(i);
        }

        charAppears("Helicopter is such a great idea!", 'e');


    }

    public static void charAppears(String word, char letter){
        int count = 0; // count is zero because we haven't started yet.

        for( int i = 0; i < word.length(); i++){
           char temp = word.charAt(i); //this gives me every letter one  by one
            if (temp == letter){
                count++;
            }
        }  System.out.println("The number of " + letter + " in " + word + " is "+ count);
    }
}
