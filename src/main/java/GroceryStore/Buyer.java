package GroceryStore;

public class Buyer {
    String fullName;
    String email;
    String address;
    boolean isResident;
    byte age;

//    what kind of action scan a buyer do?
//    buy, search, pay, add items to cart, delete items from cart, return, write a review
//    display buyer's information
    public void display(){
        System.out.println("Buyer's display");
        System.out.println("Full name: " + fullName);
        System.out.println( "Age: " + email);
        System.out.println("Address: " + address);
        System.out.println("Is resident: " + isResident);


    }

//    create a method that udpates user's residency:


//    public void updateResidency( boolean NewResidency ){
//        isResident= newResidency;
//    }

//    }


    /*pseudo code
    list of
     */

//    you can put in brackets for example:
//    buyer.enterInfo(name: "John Wick", age etc///
/*
    public  void enterInfo(String fullName, byte age, ){

    }

    /*package groceryStore;

public class Buyer {
    String fullName;
    int age;
    boolean isResident;
    String address;
    public void enterInfo(String name, int age1, boolean resident, String address1){
        fullName = name;
        age = age1;
        isResident = resident;
        address = address1;
    }
    // dispay
    public void display(){
        System.out.println("Buyer's display");
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Resident: " + isResident);
        System.out.println("Address: " + address);
    }


}

     */




//    Methods:
//    Method signature:
//    public void display(){ => this piece of code is cold method signature;
//    sout("Hello";}

//    return method:
//    void: this method dpes not return anything it is used. it simply executes(runs) the code inside that method.
//
//    bark();
//    public void bark(){}

//    transferMoney();
//    public boolean isTransferred(){} => it is different/ don't rename is

//    public boolean tarnsferMoney(){}
//
//    display();
//    public void display(){} void=does not expect value

//    calculateAPR();
//    public double calculateAPR(){}

//
//    public int convertToEuro(int money){
//    int euro=money *0.9;
//    return euro;



}
