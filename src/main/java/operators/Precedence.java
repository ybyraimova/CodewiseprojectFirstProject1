package operators;

public class Precedence {
    public static void main(String[] args) {
        int x= 2+3*2; //8
        int w=2*3+2; //8
        x=5+10/2 +20 -5;

        int a=5;
        int b=3;
        int c=8;

        int g=a=b; //3
        System.out.println(g);

        c=b=a;//5


    }
}
