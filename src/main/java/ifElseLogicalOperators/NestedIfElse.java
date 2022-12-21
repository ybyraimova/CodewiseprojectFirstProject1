package ifElseLogicalOperators;

public class NestedIfElse {

    public static void speeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed > 60 && speed <= 80) {
                System.out.println("you get small ticket");
            } else if (speed > 80) {
                System.out.println("you get big ticket");
            } else {
                System.out.println("No ticket");
            }
        }
    }


    public static boolean add(int a, int b, int c) {
        if (a + b == c || a + c == b || b + c == a) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars >= 40) {
                System.out.println("Weekend party successful");
                return true;
            } else {
                System.out.println("The party failed on weekend");
                return false;
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                System.out.println("Party was successful on weekday");
                return true;
            } else {
                System.out.println("party failed on weekday");
                return false;
            }

        }
    }

    public static int lottery(int a, int b, int c) {
        if(a==c){
            if(a==b){
                return 20;
            }
            return 10;
        } else if (b==c) {
            if(b==a){
                return 20;
            }
            return 10;
        }else{
            return 0;
        }
    }




        public static void main (String[]args){
            speeding(90, true);
            speeding(81, false);
            speeding(60, false);
            System.out.println(add(1,2,5));
            System.out.println(add(2,6,1));
            System.out.println(add(2,5,1));
            cigarParty(70, true);
            cigarParty(30, true);
            cigarParty(80, false);
            cigarParty(45, false);
            System.out.println(lottery(20,20,20));
            System.out.println(lottery(20,5,20));
            System.out.println(lottery(5,20,20));
            System.out.println(lottery(1,3,5));


        }
    }

