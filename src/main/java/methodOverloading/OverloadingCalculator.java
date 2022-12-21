package methodOverloading;

public class OverloadingCalculator {
    /* create 3 addition methods: 2 int params, 3 int params, 2 doubles
    3 subtraction: 2 int params, 3 int params, 2 doubles
    3 multiplication: 2 int params, 3 int params, 2 doubles
    3 division: 2 int params, 3 int params, 2 doubles
     */

    public static void main(String[] args) {
        System.out.println(addition(10,15));
        System.out.println(addition(10,15,25));
        System.out.println(addition(2.5,6.5));

        System.out.println(subtraction(100,80));
        System.out.println(subtraction(100,80, 60));
        System.out.println(subtraction(500.4, 70.6));

        System.out.println(multiplication(2,100));
        System.out.println(multiplication(2,5,10));
        System.out.println(multiplication(20.5,10.5));

        System.out.println(division(100,50));
        System.out.println(division(1500,40, 4));
        System.out.println(division(450.5, 3.2));
    }

//  ADDITION
    public static double addition(int a, int b){
        return (double) (a+b);
    }
    public static  double addition(int a, int b, int c){
        return (double) (a+b+c);
    }
    public static double addition(double a, double b){
        return a+b;
    }

//SUBTRACTION
    public static double subtraction(int a, int b){
        return (double) (a-b);
    }
    public static  double subtraction(int a, int b, int c){
        return (double) (a-b-c);
    }
    public static double subtraction(double a, double b){
        return a-b;
    }

//MULTIPLICATION
    public static double multiplication(int a, int b){
        return (double) (a*b);
    }
    public static  double multiplication(int a, int b, int c){
        return (double) (a*b*c);
    }
    public static double multiplication(double a, double b){
        return a*b;
    }

// DIVISION
    public static double division(int a, int b){
        return (double) (a/b);
    }
    public static  double division(int a, int b, int c){
        return (double) (a/b/c);
    }
    public static double division(double a, double b){
        return a/b;
    }
}


