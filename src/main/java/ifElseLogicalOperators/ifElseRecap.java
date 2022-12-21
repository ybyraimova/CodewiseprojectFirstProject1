package ifElseLogicalOperators;

public class ifElseRecap {

    public static void caughtSpeeding(int speed, boolean isBirthday) {


        if (speed <= 60) {

            System.out.println("not ticket");

        } else if (speed > 60 && speed <= 80 && !isBirthday) {

            System.out.println("one ticket");
        } else if (speed > 60 && speed <= 80 && isBirthday) {
            System.out.println("since it's birthday, no ticket");
        } else if (speed > 80 && !isBirthday) {
            System.out.println("two tickets");
        } else if (speed > 80 && isBirthday) {
            System.out.println("You are lucky, no big ticket since its your birthday");
        }

    }

    public static void main(String[] args) {
        caughtSpeeding(120, true);
        love6(5,6);
        System.out.println(love6(5,6));
        System.out.println(love6(5,1));
        System.out.println(love6(100,20));


    }


    public static boolean love6(int a, int b) {
        if (a==6||b==6||a+b==6){
            return true;
        }else{
            return false;
        }

    }


}




