package methodOverloading;

public class MethodOverloading1 {
    public static void main(String[] args) {
        method1();
        method1(4);
        hello("Siri");
        hello("Siri", "Mac");

    }
    public static void method1(){
        System.out.println("no parameters inside");

    }

    public static void method1(int a){
        System.out.println("int a inside " + a);

    }


    public static void hello(String name){
        System.out.println("Hello "+ name );

    }
    public static void hello(String name, String surname){
        System.out.println("Hello " + name + " " + surname);

    }

}

