package methodOverloading;

public class MethodOverloading2 {
    public static void main(String[] args) {

    }

    public static int sum(int a, int b){
        System.out.println("sum: " + (a+b));
        return a+b;
    }

    public static int sum (double a, double b){
        return (int)(a+b);
    }

    public static int sum(float a, float b){
        return (int)(a+b);
    }

    public static String stringMethod(String a, String b, String c, String d, String e, String f, String g,
                                      String h, String i, String j){
        return a;
    }

}
