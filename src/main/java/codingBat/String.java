package codingBat;

public class String {
    public static void main(String[] args) {

    }

    public String helloName(String name) {
        System.out.println("Hello " + name);
        return name;
    }
// The following worked:
//    public String helloName(String name) {
//        return "Hello " + name + "!";

//    public String firstTwo(String str) {
//        if (str.length() >= 2) {
//            return str.substring(0, 2);
//        } else {
//            return str;
        }
        // Solution notes: need an if/else structure to call substring if the length
        // is 2 or more, and otherwise returnn the string itself







