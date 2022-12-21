package ifElseLogicalOperators;

public class OrOperator {
    public static void main(String[] args) {
//        || or |
//

        int a=10;
        int b=50;
        int c=20;
        int d=90;

        if(a>b||b==c){
            System.out.println("if condition ");
        } else if (c==d||d>b||a<b) {
            System.out.println("else condition");

        }else{
            System.out.println("this is else");
        }
//        new

        boolean b1=10>5||5<3;
        System.out.println("b1: " + b1);


    }
}
