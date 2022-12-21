package ifElseLogicalOperators;

public class NotEquals {
    public static void main(String[] args) {
        int num1=10;
        int num2=5;
        System.out.println(num1 != num2); //true
        System.out.println(num1 == num2); //false

        String name1= "Johny";
        String name2= "Johny";
        String name3 = new String ("Johny");

        System.out.println(name1== name2);//true
        System.out.println(name1 ==name3);//false
        System.out.println(name1 != name3);//true
        System.out.println(name1 != name2); //false


        /*
        .equals() to compare string values, can only be used by string
         */


        Calculator calculator1 =new Calculator();
        Calculator calculator2=new Calculator();
        Calculator calculator3=calculator1;
        System.out.println(calculator2.equals(calculator1)); //false - two different objects
        System.out.println(calculator1.equals(calculator3)); //true is the same object
    }
}
