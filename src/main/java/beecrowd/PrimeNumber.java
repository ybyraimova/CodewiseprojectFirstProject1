package beecrowd;

public class PrimeNumber {
    public static boolean isNumberPrime(int number) {
        boolean isPrime = false;
        int count = 0;
        for(int i = 1; i <= number; i++) {
            //i = 1;
            //i = 2;
            //i = 3;
            //i = 4
            //i = 5;
            //i = 6
            // i = 7
            if(number % i == 0){
                //7 % 1  == 0;
                count++;
                //count = 1;
                //count = 2;
            }
        }

        //count = 2;

        if(count == 2) {
            isPrime = true;
        }
        return isPrime;
    }
}
