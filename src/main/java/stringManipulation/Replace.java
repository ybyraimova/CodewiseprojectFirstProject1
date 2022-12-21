package stringManipulation;

public class Replace {
    public static void main(String[] args) {
        /*
        replace()
         */
        String hello = "Hello world!";
        hello = hello.replace('l', 'w');
        System.out.println(hello);
        hello = hello.toUpperCase().replace('e', 'a');
        System.out.println(hello); //it didnt change because now all the letters are upper case;

//       replace string
        String cake = "honeycake";
        System.out.println(cake= cake.replace("honey", "chocolate "));
        System.out.println(cake= cake.replace("chocolate", "honey"));




    }
}
