package ifElseLogicalOperators;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        double firstNumber = user.nextDouble();

        System.out.println("Please enter the arithmetic operator: ");
        String operator = user.next();

        System.out.println("Please enter second number: ");
        double secondNumber = user.nextDouble();

        double result;


        if (operator.equals("+")) {
            result =firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operator.equals("/")) {
            result = firstNumber/secondNumber;
        } else if (operator.equals("*")) {
            result = firstNumber* secondNumber;
        }else if(operator.equals("%")){
            result = firstNumber % secondNumber;
        }else{
            System.out.println("ERROR! Please enter valid operator!");
            result =0.0;
        }
        System.out.println( "The result is: " + result);



    }
}
