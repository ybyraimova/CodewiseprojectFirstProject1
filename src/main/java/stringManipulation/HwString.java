package stringManipulation;

public class HwString {
    public static void main(String[] args) {

        String hello1 = "Hello World!";

        String hello2 = "Hello world!";

        String hello3 = new String("HelloWorld!");

        //        1. write a program that compares values of hello1 and hello2
        boolean hello12 = hello1 == hello2;
        System.out.println(hello12);
        //
//        2. write a program that compares values of hello1 and hello3
        boolean hello13 = hello1 == hello3;
        System.out.println(hello13);
//
//        3. write a program that compares of hello1 and hello2 are same objects
        boolean isSameObject = hello1.equals(hello2);
        System.out.println(isSameObject);
//
//        4. write a program that compares hello1 and hello2 and make sure the result will be true
        hello1=hello2;
        boolean isTrue = hello1.equals(hello2);
        System.out.println(isTrue);

//
//        5. convert hello1 and hello2 to all lower case and compare them
        boolean isSameObject2 = hello2.toLowerCase() == hello1.toLowerCase();
        System.out.println(isSameObject2);
    }
}
