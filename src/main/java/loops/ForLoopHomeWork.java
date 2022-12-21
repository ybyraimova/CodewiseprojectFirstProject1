package loops;

public class ForLoopHomeWork {
    public static void main(String[] args) {

//        1. create a loop that prints all December days from 1 to 31:

        for(int a = 1; a <=31; a++){
            System.out.println( a + " December 2022");
        }
        System.out.println("\n");

//        2. create a loop that prints all even numbers from 1 to 200:
        for( int i = 1; i <=200; i++){
            if(i % 2 == 0){
                System.out.println("even: " + i);
            }
        }
        System.out.println("\n");

//        3. create a loop that prints all odd numbers from 100 to 1:

        for( int w = 100; w>=1; w--){
            if(w % 2 != 0){
                System.out.println(w + " - odd");
            }

        }
        System.out.println("\n");
//        4. create a loop that prints all the values divisible by 7 in the range of 1 to 100 in reverse order.
        for(int g = 100; g>= 1; g--){
            if(g % 7 == 0){
                System.out.println(g + " can be divided by 7");
                System.out.println(g / 7);
            }
        }



    }
}
