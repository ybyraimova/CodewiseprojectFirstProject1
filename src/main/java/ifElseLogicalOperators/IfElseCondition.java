package ifElseLogicalOperators;

public class IfElseCondition {
    public static void main(String[] args) {
        int a = 100;
        int b=200;

        if (a>b) {
            System.out.println(a + " is more than " + b);
        }else{
            System.out.println(a + " is not more than " + b );
        }

        if (a==b) {
            System.out.println("a is equal to b");
        }else{
            System.out.println("a is not equal to b");

        }
//        ==============================
        /* if, else if condition
        if (true) --> code executed
        else if() --> code ingored
        else{} --> code will be ignored
         */

        short sh=32;
        short sh2=-32;

        if (sh>sh2){
            System.out.println("sh is  more than sh2");
        }else if(sh== sh2){
            System.out.println("sh is equal to sh2");
        }else{
            System.out.println("sh is less than sh2");
        }

        String welocmeSign = "Welcome to California!";
        String stateName = "Florida";

        boolean bb = welocmeSign.contains(stateName);

        if (bb){
            System.out.println(welocmeSign + " contains " + stateName);
        }else if(!welocmeSign.contains(stateName)){
            System.out.println("welcomeSign does not contain stateName");
        }
        System.out.println("A code after if condition");


    }


}
