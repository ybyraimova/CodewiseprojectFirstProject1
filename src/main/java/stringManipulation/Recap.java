package stringManipulation;

public class Recap {
    public static void main(String[] args) {
        String city ="Chicago"; // this can be used only in main method!
        welcome("city");



        int num;
        int num2;
        num=2;
        num2=5;
        adds(2,5);
        adds(num, num2);



        double price;
        double tax;
        price = 100;
        tax=0.06;
        calculateTax(price, tax);



        double product1= calculateSalesTax(100);


    double finaltopay= discout20(100);
        System.out.println(finaltopay);





    }

    public static double calculateTax(double price,double tax){
        double result =  price*tax + price;
        System.out.println("The price with tax would be: " + result);
        return result;
    }

    public static double calculateSalesTax(double price){
        double result;
        double salesTax = price*0.06;
        result = salesTax + price;
        System.out.println("The price with sales tax would be: " + price + " price and tax " + result);
        return result;
    }

//1. method signature would be:
    public static double discout20(double totalPrice){
       double resultAfterDiscout;
        double resultAfterdiscout = totalPrice -(totalPrice*0.2);
        return resultAfterdiscout;
    }



    public static void welcome(String someCity){
        System.out.println("Welcome to "+ someCity);
    }



    public static void adds(int num, int num2){    //method signature int num, int num2
        int sum=num+num2;
        System.out.println(sum);

    }







}
