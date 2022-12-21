package operators;

public class RecapOperators {
    public static void main(String[] args) {
        String text ="Java programmer!";
        int number = 20;
        double d=10.23;
        char c='j';
        char k='&';
        byte b=12;
        System.out.println("String text: " + text + " " + number + " " + d + " " + c + " "+ k +" " + b );
        System.out.println("number " + number);
        System.out.println("double d " + d);
        System.out.println( "char c" +c);
        System.out.println("byte b " + b);

        int n=20;
        double d2=30.5;

        int a=145;
        int square=a*a;
        System.out.println("The area of the square is " + square);
        System.out.println("The width and length of a square: " +a);


        int v=123;
        int perimeter = (v+v)*2;
        System.out.println("The width of the square: " + v);
        System.out.println("The length of the square: " +v);
        System.out.println("The perimeter of square is: " +perimeter);

        int length =98;
        int width =54;
        System.out.println("The length of rectangle is " + length);
        System.out.println("The width of rectangle os " + width);
        System.out.println("The perimeter of rectangle is " + 2*(length+width));
        System.out.println( "The square of rectangle is " + length*width);

        int e=12;
        int o=5;
        //additional operator
        System.out.println("e+o= " +(a+b));
        //subtraction operator
        System.out.println("e-o= " + (e-o));
        System.out.println("e*o= " + (e*o));
        System.out.println("e/o= " + (e/o));

        int result =1+2;

        System.out.println(result);

        result = result -1;
        result-=1;
        System.out.println(result);

        result = result *2;
        result*=2;
        System.out.println(result);

        result = result/2;
        result/=2;
        System.out.println(result);

        result = result + 8;
        result = result % 7;
        System.out.println(result);

//        ++i => pre-ecrement io +1
//        i++ => post ecrement io +1

        int i =3;
        i++; //3+1
//        System.out.println(i="i " + i);

//        =========COMPARISON OPERATORS============
        boolean compare;
        compare= 3==5;
//        = assign the value
//        ==compare, equals?
        System.out.println(compare);

        System.out.println("3>5: " + (3>5));
        System.out.println("3<5: " + (3<5));
        System.out.println("3>=5 " + (3>=5));
        System.out.println("3<=5 " + (3<=5));

/*   == equals ?
    != not equal ?
 */
        System.out.println("3 != 5 " + (3 != 5));
        System.out.println();

        int age=30;
        int years =-30;
        boolean isTrue = age != years;
        System.out.println(isTrue);

        int x= 10;
        int y=5;
        int exp1=(y*(x/y+x/y));
        int exp2 = (y*x/y+y*x/y);
        System.out.println(exp1);
        System.out.println(exp2);

        int exp4 = y * x;
        exp4 = exp4 / y;
        exp4=exp4 + (y*x/y);
        System.out.println(exp4);

        int z=9;
        int t=12;
        int u=2;
        int m=4;
        int l=6;
        int exp3= (3+4*z)/5-10*(12-5)*(u+4+6)/9*(4/9+ (9+9)/12);
        System.out.println(exp3);
        int exc=(3+4*9)/5;

















    }
}
