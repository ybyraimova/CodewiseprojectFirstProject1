package loops;

public class NestedWhileLoop {
    /*
    Year: 21 - 2022 -23-
    month 1
    month 2
     */

    public static void main(String[] args) {

        int year = 2021;
        while (year <= 2023) {
            System.out.println("YEAR: " + year);
            year++;

            int month = 1;
            while (month <= 12) {
                System.out.println("month " + month);
                month++;
            }
        }

//            use while loop to print:
//            2000 up tp 2049;
//            3000 up to 3049;
//            4000 up to 4049;
//            5000
//            wohoo I'm done

        int first = 2000;
        while (first <=5000){
            System.out.println("\n");
            System.out.println(first);

            int c= first+ 1;
            while (c<= first+ 49){
                System.out.println("  " + c);
                c++;
            }
            first  +=1000;
        }
        System.out.println("Wohoo, I'm done");

        int j =1;
        while (j<=7){
            int k=1;
            while (k<=j){
                System.out.print(j);
             k++;
            }
            System.out.println(k);
            j++;
        }

//        multiplication table while loop
        int digit = 1;
        while(digit <=10){
            System.out.println("Multiplication table for: " + digit);

            int digit2 = 2;
            while (digit2<=9){
                digit2++;
                System.out.println( digit + " x " + digit2 + " = " + (digit*digit2));
            }
            digit++;
        }

//        multiplication table for loop

        for(int f=1; f<=10; f++){
            for (int g=1; g<=f; g++){
                System.out.print( "*");
            }
            System.out.println();
        }

        for (int num = 2; num <= 9; num++){
            System.out.println("Multiplication table for: " + num);
            for(int num2 = 1; num2 <= 10; num2++){
                System.out.println(num + " x " + num2 + " = " + (num*num2));
            }
        }

//        nested do-while loop



//        create multiplication table using do - while

        int number1 =1;
        do{
            System.out.println("Do while multiplication table for " + number1);

            int number2=1;
            do{
                System.out.println(number1 + " * " + number2 + " = " + (number2*number1));
                number2++;
            }while (number2 <=10);
            number1++;
        }while (number1 <=10);


//        ============================================
//        for loop nested
        for(int i=1; i<=10; i++){
            System.out.println("For loops: Multiplication number: " + i);
            for(int k =1; k<=10; k++){
                System.out.println(i + " * " + k + " = " + (i*k));
            }
        }

        /*
        print numbers 1-10
        if number = even, print: n times (number* number = 333, 4444)
        if number = odd, print this number juts 1 time: odd
         */
        int num1=1;
        do{
            int num2 = 1;
            if(num1 % 2 ==0){
                do{
                    System.out.print(num1);
                    num2++;
                }while(num2<=num1);
                System.out.println();
            }else{
                System.out.println(num1 + " : odd");
            }
            num1++;
        }while (num1 <=10);


}



        }




