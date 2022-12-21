package operators;

public class UnaryOperators {
    public static void main(String[] args) {
        //Unary operators
        //++  --> 1+ value , += --> assigns and +
        //-- --> -1 from value , -= --> assigns and -
        //*=  --> it means multiplication, /= --> it means divison only regular


        int a=5;
        int b=10;
        System.out.println(a+b);//5+10
        System.out.println(++a);//1+5
        System.out.println(++b);//1+10

        System.out.println(b--); //10-1=9


        a=++a;
        b=++b;
        b=--a;

        a=--a;
        b=--a;

        //++x - prefix,
        //x++ -postfix


    }
}
