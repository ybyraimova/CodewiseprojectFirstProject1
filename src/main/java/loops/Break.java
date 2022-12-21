package loops;

public class Break {
    public static void main(String[] args) {
        /*
        break is a java keyword which is used to jump out of loop, to break loop.
        it can be used with all loops:
        for loop, while loop, do-while loop.
        ===
        print all  1-10.
        if number =8, we want to stop printing
         */

        for(int i = 1; i<=10; i++){
            if (i==8){
                break;
            }
            System.out.println(i);
        }

//        print 20-30, if num =25, break. use while loop

        int n =20;
        while (n < 30){
            System.out.println(n);
            if(n == 25){
                System.out.println("reached 25, breakin while loop");
                break;
            }
            n++;
        }
        int l = 5000;
        do{
            System.out.println(l);
            if (l==5020){
                System.out.println("reached 5020.");
                break;
            }
            l++;
        }while (l<=10000);


    }
}
