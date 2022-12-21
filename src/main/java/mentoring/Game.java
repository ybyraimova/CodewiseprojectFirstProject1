package mentoring;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
//        This game is number guessing game:
//        first step:
        Random random = new Random();
        int someRandom  = random.nextInt(11);

//        second step:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 0 to 10");
        int guess = scanner.nextInt();

//        third step:
        if (guess > someRandom){
            System.out.println("Your guess is too high");
        }
        else if(guess < someRandom){
            System.out.println("Your guess iis too low");
        }
        else {
            System.out.println("Congratulations!");
        }
        System.out.println("Random number was: " + someRandom);

    }

//    with proloop to give 5 lives to guess number


    }




