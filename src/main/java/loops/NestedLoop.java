package loops;

public class NestedLoop {
    public static void main(String[] args) {

//        for loop

        for(int i=1; i<=10; i++){
            System.out.println(i + ") Hello!");
        }

//      while loop

        int a=1;
        while (a<=10){
            System.out.println(a + ". Hello!");
            a++;
        }

//        do-while loop
        int d=10;
        do{
            System.out.println(d+ ". bye-bye");
            d--;
        }while(d>0);

//        NESTED FOR LOOP
//        create a loop to iterate three times (3 weeks). And inside the loop, create another loop.
        for(int i=1; i<=3; i++){
            System.out.println("WEEK: " + i);

            for(int j=1; j<= 7; j++){
                System.out.println("Day: " + j); //the inner loop will be completed for 7 times then it goes back to
                                                // to first outer loop
            }
        }


//        created nested for loop. print 12 months and 30 days in each of the month
        for(int month = 1; month <= 12; month++){
            System.out.println(month + " MONTH");

            for (int day =1; day <=30; day++){
                System.out.println(day + " day");
            }
            System.out.println( "End of the month");
        }

        /* print this:
        *
        * *
        * * *
        * * * *
        * * * * *
        *
         */

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("!!! HAPPY NEW YEAR !!!");
//half:
        for(int f=1; f<=10; f++){
            for (int g=1; g<=f; g++){
                System.out.print( "*");
            }
            System.out.println();
        }

//        print Christmas tree with happy new year on the bottom
        for (int i = 1; i < 7; i++){
            for(int n = 1; n <= 7 - i; n++){
                System.out.print(" ");
            }
            for( int b = 1; b <= i * 2 - 1; b++){
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < 4; i++)
            System.out.println("   *******".substring(i, 4 + 2*i));


    }




}



