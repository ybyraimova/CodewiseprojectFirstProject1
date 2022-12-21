package classesAndObjects;

//   Class Cake
public class Cake {
    //    Attributes of the object:
    String name;
    int price;
    boolean isOrganic;
    double weight;

    //    Methods related to object:
    public void weights() {
        System.out.println("The " + name + " weights " + weight + "lb.");
    }

    public void costs() {
        System.out.println("The " + name + " costs " + price + "$.");
    }

    public boolean isOrganic() {
        System.out.println("The " + name + " is organic:  " + isOrganic);
        return isOrganic;
    }
}

//    Class Bakery

class Bakery {
    public static void main(String[] args) {
//            Created three new objects:
        Cake redVelvet = new Cake();
        Cake medovik = new Cake();
        Cake chocolate = new Cake();

//            Print out objects attributes and methods:

//            1. Red velvet
        System.out.println("\n");

        redVelvet.name= "Red Velvet";
        redVelvet.price= 26;
        redVelvet.weight= 5.4;
        redVelvet.isOrganic=false;

        redVelvet.costs();
        redVelvet.weights();
        redVelvet.isOrganic();

//            2. Medovik
        System.out.println("\n");

        medovik.name= "Medovik";
        medovik.price= 30;
        medovik.weight= 6.2;
        medovik.isOrganic=true;

        medovik.costs();
        medovik.weights();
        medovik.isOrganic();

//            3.Chocolate cake

        System.out.println("\n");

        chocolate.name= "Chocolate cake";
        chocolate.price= 25;
        chocolate.weight= 5.9;
        chocolate.isOrganic=true;

        chocolate.costs();
        chocolate.weights();
        chocolate.isOrganic();



    }

}

