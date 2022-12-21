package mentoring;

public class Space {
    public static void main(String[] args) {




    int num = add(223, 2232);
        System.out.println(num/2); //average number of 223 and 2232

    multiply(10, 10);
    welcome("Aichurok", 23);
    welcome("Siri", 25);






    }
//    Method signature looks like this:
    public static int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void multiply(int num1, int num2){
        int result = num1 * num2;
        System.out.println(result);
    }

//    if you don't have static in your methods, you would not be able to practice methods
//    as in this class

    public static void welcome(String name, int age){

        System.out.println("Hey " + name +  ", Welcome to my program!");
        System.out.println("You are " +age);

    }





}
