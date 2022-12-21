package loops;

public class ForLoops {
    public static void main(String[] args) {
            /*
    for(initialization, condition, increment/decrement){
    }
     */


//        Create a program that will print num 1 to 100:
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        //        Create a program that will print num 2 to 50:
        System.out.println("\n");
        for (int i = 2; i <= 50; i++) {
            System.out.println(i);
        }

        //        Create a program that will print num 0 to 1000:
        System.out.println("\n");
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }

        //        Create a program that will print 1-20 apples:
        System.out.println("\n");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " apples");
        }

        //        Create a program that will print apple # 1-50:
        System.out.println("\n");
        for (int i = 1; i <= 50; i++) {
            System.out.println("Apple #" + i);
        }

        //        Create a program that will print  2*1 - 2*10
        System.out.println("\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }


        //        Create a program that will print  9*1 - 9*10
        System.out.println("\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(9 + " * " + i + " = " + 9 * i);
        }

        //        Create a program that will print 100*1 - 100*100
        System.out.println("\n");
        for (int i = 1; i <= 100; i++) {
            System.out.println(100 + " * " + i + " = " + 100 * i);
        }

        //        Create a program that will print java is fun 5 times
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Java is fun");
        }

        //        Create a program that will print My name is yourName
        System.out.println("\n");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ") My name is Aichurok");
        }

        //        Create a program that will print 10 to 1
        System.out.println("\n");
        for (int i = 10; i >= 1; i--) {
            System.out.println("The value of x is: " + i);
        }

//        infinite loop ERROR
//        for (int i = 10; i>=1; i++){
//                           here 11, 12, 13 and so forth are bigger than 10
//        } so it will never stop

        //        Create a program that will print 100 to 1; if number is even and odd
        System.out.println("\n");
        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " is even");

            }else {
                System.out.println("\n");
                System.out.println(i + " is odd");
            }
        }

//Another way to solve:
        System.out.println("\n");
        for (int i = 100; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " is EVEN");

            }else{
                System.out.println("\n");
                System.out.println(i + "  is ODD");
            }
        }

        multiplication(5);
        multiplication(10);
        addition(2);
        division(400);



//        compound
        for (int i=0; i<= 10; i= i+2){
            System.out.println(i);
        }


        for (int i=10; i>= 0; i= i-2){
            System.out.println(i);
        }

        method1(10);
        method1(15);
        multuplication1(2);





    }

    //        Create a method will print multiplication table for a number that will be indicated in method:

    public static void multiplication(int number){
        System.out.println("\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

    }

    public static void addition(int number){
        System.out.println("\n");
        for (int j =1; j<= 50; j++){
            System.out.println(number + " + " + j + " = " + number + j );
        }
    }

    public static void division(double number){
        System.out.println("\n");
        for (int j =1; j<= 5; j++){
            System.out.println(number + " / " + j + " = " + number / j );
        }
    }

//    number =10
//    print the number is 1 ,2,3
//    the total number is
    public static void method1(int number){
        int sum = 0;
        System.out.println("\n");
        for (int j = 1; j <= number; j++){
            System.out.println("The number is " + j);
            sum+=j;
    }
        System.out.println("The total sum is " + sum);
    }

    public static void   multuplication1(int number){
        int result = 1; //it should be one, so it won't be zero in the results
        System.out.println("\n");
        for (int j= 1; j <= number; j++){
            System.out.println("The number is " + j);
            result*=j;
        }
        System.out.println("The total result is " + result);
    }

}
