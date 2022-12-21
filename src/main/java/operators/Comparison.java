package operators;

public class Comparison {
    public static void main(String[] args) {
        /*
        Comparison operators are <,>, <=, >=, ==
        == compares two values, does not assign value

         */
//        < > =< =>
        int a=2;
        int b=5;
        int c=2;
        int r=10;
        System.out.println("a>b" +(a>b));
        System.out.println("r>=b" +(r>=b));
        System.out.println("c==a" +(c==a));
        System.out.println("b<=r" +(b<=r));
        System.out.println("a<=c" + (a<=c));


        boolean compare;
        compare= 3==5;
//        = assign the value
//        ==compare, equals?
        System.out.println(compare);

        System.out.println("3>5: " + (3>5));
        System.out.println("3<5: " + (3<5));
        System.out.println("3>=5 " + (3>=5));
        System.out.println("3<=5 " + (3<=5));


    }
}
