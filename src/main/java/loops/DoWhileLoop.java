package loops;

public class DoWhileLoop {
    public static void main(String[] args) {
//        write a program that prints numbers 100 - 1; in the end print the sum of all numbers;
//        if number divisible by 5: divisible by 5;
//        if number is divisible by 5 and its not even: weird number;
//        if number is even: print number even;
//        if number is not divisible by 5 and its odd: odd number

//        100 divisible by 5;
//        99
//        98 even
//        97
//        96 even
//        95 weird number
//        The sum of all numbers: 5050;

//        while loop:
        int a = 100;
        int sum=0;
        while (a>=1){
            if (a % 5== 0 && a % 2 != 0){
                System.out.println(a + " weird number");
            }else if(a % 5 == 0){
                System.out.println(a + " divisible by 5");
            }
            if( a % 5 != 0 && a % 2 !=0){
                System.out.println(a + " odd number");
            }
            if(a % 2 == 0){
                System.out.println(a + " even");
            }else{
                System.out.println(a);
            }
            sum+=a;
            a--;
        }
        System.out.println(sum);



        int t = 100;
        int sum1 = 0;

        while(t >= 1){
            if (t % 5 == 0){
                System.out.println(t + " divisible by 5");
                if (t % 2 != 0){
                    System.out.println(t + " weird number");

                }
            }else{
                if (t % 2 != 0){
                    System.out.println(t + " odd number");
                }
            }
            if (t % 2 == 0){
                System.out.println(t + " even number");
            }
            sum1+=t;
            t--;
        }
        System.out.println(sum1);






    }
}
