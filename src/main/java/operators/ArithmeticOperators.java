package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        //ASSIGNMENT OPERATOR =

        int x = 5;
        System.out.println("The value of x: " + x);

        int f = 9;
        System.out.println("Значение f равно: " + f);

        //REASSIGNMENT OPERATOR =

        System.out.println("Новое значение f равно: " + f);

        x = 10;
        System.out.println("The value of x: " + x);

        x= x+5; //10

        //x - operand
        //10 - operand
        //= operator

        int y = 20;
        int p = 10; //p contains 10

        y=5; //5
        y=p; //10

        y=y; //10

        p=y; //10
        p=5; //5
        p= p +20; //25
        y=p; //25

        String a = "abc";
        String b = "xyz";
        a="Chicago";

        //ARITHMETIC OPERATORS

        short num =10;
        short num2=20;
        int sum=num+num2;

        System.out.println(sum);
        System.out.println(sum+5);
        System.out.println(num+100);

        int q=1;
        int r=2;
        int s=r-q;

        System.out.println(s+5);
        s=s+2-1;

        //multiplication
        long l=10;
        long k=5;
        System.out.println(l*k);

        //division
        byte mybyte=9;
        byte mybyte2=3;
        System.out.println(mybyte/mybyte2);
        mybyte2 = (byte)(mybyte/mybyte2);


        //Modulus % - остаток после деления
        int j=10;
        int m=3;
        System.out.println(j % 3); //1 - it is leftover from /division
        System.out.println(j/3); // 3

        System.out.println(25% 3 ); //1
        System.out.println( 5%3); //2
        System.out.println(10%9); //1
        System.out.println(10 % 7); //3
        System.out.println(85 % 40); //5
        System.out.println(29 %3); //2
        System.out.println(10%2);//0

//        =======Practice=============== --> shortcut comand+/  - one line
        /* mutliple line comment

         */

        int digit =100;
        int anotherdigit=20;
        System.out.println(digit % anotherdigit);//0
        System.out.println(digit % 30); //10
        System.out.println(digit % 35); //30
        System.out.println(digit % 45); //10
        System.out.println(1500 % 60 ); //0
        System.out.println(150 % 50); //0
        System.out.println(140 % 60 );//20
        System.out.println(130 % 60 );//10
        System.out.println(150 % 60); //30x
        System.out.println( 119 %120); //it's gonna be 120 - the biggest number





        



















    }
}
