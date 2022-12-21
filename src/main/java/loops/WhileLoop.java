package loops;

public class WhileLoop {
    public static void main(String[] args) {
//        using while lopp, write a program to writr 10 times : Good morning everyone!
        int a = 1;
        while (a <= 10) {
            System.out.println("Good morning everyone");
            a++;
        }

        int x = 0;
        while (x <= 20) {
            System.out.println(x);
            x++;
        }

        while (a <= 31) {
            System.out.println(a + " January 2023");
            a++;
        }

        int s = 1;
        while (s <= 30) {
            if (s % 2 == 0) {
                System.out.println(s + " - even  + " + 3 + " = " + (s + 3));
            } else {
                System.out.println(s + " - odd  + " + 2 + " = " + (s + 2));
            }
            s++;
        }


        for (int z = 100; z >= 1; z--) {

            if (z % 4 == 0) {
                System.out.println(z + ": quarter");
            }
            if (z % 2 == 0) {
                System.out.println(z + ": double");
            } else {
                System.out.println(z);
            }
        }




    }
}

