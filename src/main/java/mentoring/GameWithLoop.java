package mentoring;

import java.util.Random;
import java.util.Scanner;

public class GameWithLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int someRandom = random.nextInt(11);

//        second step:
            Scanner scanner = new Scanner(System.in);
            System.out.println("Guess the number between 0 to 10");
            int guess = scanner.nextInt();

//        third step:
            if (guess > someRandom) {
                System.out.println("Your guess is too high");
            } else if (guess < someRandom) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Congratulations!");
            }
            System.out.println("Random number was: " + someRandom);
        }
    }
}
