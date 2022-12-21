package ifElseLogicalOperators;

public class NestedIfElsePractice {
    public static void main(String[] args) {
        System.out.println(teenNumber(7, 10));
        System.out.println(teenNumber(13, 15));
        System.out.println(teenNumber(15, 10));
        System.out.println(teenNumber(13, 2));
        System.out.println(teenNumber(20, 13));



    }

    public static int teenNumber(int a, int b) {
        if (a >= 13) {
            if (a <= 19) {
                return 19;
            }
        }

        if (b >= 13) {
            if (b <= 19) {
                return 19;
            }
        }
        return a + b;

    }


}


