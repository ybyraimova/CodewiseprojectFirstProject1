package operators;

public class OperatorsHomework {
    public static void main(String[] args) {
//        1
        int a=100;
        int b=200;
        int sum=a+b;
        System.out.println(sum);
//        2
        int q=5;
        int w=9;
        int e=10;
        int sum1=q+w+e;
        System.out.println(sum1);
//        3
        int s=1;
        int d=2;
        int sum2=s+d;
        System.out.println(sum2);

        int f=3;
        int g=1;
        int ext=f-g;
        System.out.println(ext);

        int h=2;
        int j=h;
        int mult=h*j;
        System.out.println(mult);

        int k=4;
        int l=h;
        int div=k/l;
        System.out.println(div);

        int r=2;
        int t=8;
        int sum6=r+t;
        System.out.println(sum6);

        int y=10;
        int u=7;
        int mod=y%u;
        System.out.println(mod);
//        4
        byte length=9;
        byte width=15;
        int square=length*width;
        int perimeter= 2*length + 2*length;
        System.out.println("The area of rectangle is " + square);
        System.out.println("The perimeter of rectangle is " +perimeter);
//        5
        int i=8;
        int o=2345;
        int p=3;
        int z=5;
        int calc=(((i+o)/p)%z)*z;
        System.out.println("The result: " + calc);
//        6
//        I don't understand how to do it:  int calc1= (i+=o)/p%z*=z;
//        We cannot use two equal signs in one statement.

        i+=o; // it means i=i+o
        i/=p;// it means i=i/p
        i%=z;// it means i=i%p
        i*=z; //it means i=i*z
        System.out.println("The result of i: " + i);


        int gg=10;
        int aa=5;
        gg=15;
        gg-=aa; //gg=gg-aa; gg=15-5=10 gg=10
        gg*=aa; //gg=gg*aa; gg=10*5=50; gg=50
        gg/=aa; //gg=gg/aa; gg=50:5 gg=10






//        7
           int x=23;
           int c=45;
           boolean xc = x==c;
        System.out.println(xc);
//        8
        int v=-10;
        int n=10;
        boolean vn=v==n;
        System.out.println(vn);







    }
}
