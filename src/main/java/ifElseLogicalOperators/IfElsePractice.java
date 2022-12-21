package ifElseLogicalOperators;

public class IfElsePractice {
    public static void main(String[] args) {
        int x=100;
        int y=20;

        if(x==y){
            System.out.println("x is equal to y");
        }else if(y<x) {
            System.out.println("this is my else if code");
        } else if (x>y) {
            System.out.println("x is more than y");
    }else{
            System.out.println("this is my else condition");
        }

        System.out.println(x+y);
//
//        int x = 100;
//        int y = 20;
//
//        if (x == y){
//            System.out.println("x is equal to y");
//        }else if (y < x){
//            System.out.println("this is my 1 else if code");
//        }else if(x > y){
//            System.out.println("x is more than y");
//        } else{
//            System.out.println("this is my else condition");
//        }
//        System.out.println(x + y);


        String weather = "sunny";
        float temp = 90.5f;

        if (weather.equals("sunny")) {
            System.out.println("Let's go to the beach!");

        }
        if(temp > 104){
                System.out.println("Stay home. Too hot outside!");
            }


        if(temp > 90){
            System.out.println("Let's go walking");
        }

    }


}
