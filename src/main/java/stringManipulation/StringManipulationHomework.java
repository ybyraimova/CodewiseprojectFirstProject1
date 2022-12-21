package stringManipulation;

public class StringManipulationHomework {
    public static void main(String[] args) {

        String message = "Hello everyone, Let's do Java String exercises";

        int index = 10;





        int index2=message.indexOf('y', 10);
        System.out.println("The character at position " + message.indexOf('y') + " is " + message.charAt(10));

        System.out.println( message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println("5 letter is : " + message.charAt(6));
        System.out.println(message.charAt(message.length()-1));

        String firstLetter = String.valueOf(message.charAt(0));
        System.out.println(firstLetter);
        System.out.println(firstLetter.toLowerCase());

        String lastLetter = String.valueOf(message.charAt(message.length()-1));
        System.out.println(lastLetter);
        System.out.println(lastLetter.toUpperCase());









    }
}
