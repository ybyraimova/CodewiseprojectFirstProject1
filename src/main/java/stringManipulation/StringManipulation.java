package stringManipulation;

import classesAndObjects.Animal;
import classesAndObjects.Zoo;

public class StringManipulation {
    public static void main(String[] args) {
//        ==
        String name = "John";
        String name2= "Johnson";

        boolean isEqual = name == name2;
        System.out.println(isEqual);

        String city = "Chicago";
        String city2 = "Miami";
//        the following way would not be stored anywhere and cannot be reused:
        System.out.println("Chicago == Miami: " + isEqual);

        System.out.println(city == city2);


        isEqual = city == city2;

        String newCity = new String("Chicago");
        isEqual = newCity == newCity;
        System.out.println("Chicago == new Chicago "+ isEqual);


        Animal elephant = new Animal();
        System.out.println(elephant);

//        =============================

        String cake1 = "honeycake";
        String cake2= "cheesecake";
        String cake3= "Honeycake";
        String cake4 = "cheesecake";
        String cake5= new String("cheesecake");

        boolean iSamecake= cake1==cake2;
        System.out.println("honeycake is same as cheesecake: " + iSamecake);

        iSamecake= cake1==cake3;
        System.out.println("honeycake is same as Honeycake: " +iSamecake);

        iSamecake=cake2==cake4;
        System.out.println("cheesecake is same as cheesecake: " + iSamecake);
//      THIS ONE COMPARES OBJECT IDS: PRIMITIVE ==
        iSamecake = cake4==cake5;
        System.out.println("cheesecake is same as cheesecake: " + iSamecake);


//  New topic
//        .equals()

//        equals() method from String class:
//        THIS ONE COMPARES OBJECT VALUE BUT NOT ID (USED ONLY BY STRING):
//        comparing with a method boolean which returns true or false
        iSamecake = cake4.equals(cake5);
        System.out.println(iSamecake);

        System.out.println("USA".equals("USA"));
        System.out.println(" hello Codewise".equals("hello Codewise"));

        String animal = "elephant";
        System.out.println(animal.equals("animal"));

        String animal2= "lion";
        System.out.println(animal2.equals("Lion"));

        String animal3= new String("Lion");
        System.out.println(animal3.equals("Lion"));

        System.out.println(animal3.equals("Lion"));

        System.out.println(animal2 == "lion");

        String animal4=new String("lion");

        System.out.println(animal2==animal4);


//       What is the difference btw .equals and ==?

        int a =3;
        int b=2;
        int c=3;

        boolean isEq=a==b;




//        New topic: method : toLowerCase(), toUpperCase();
//        These are String methods, that convert text to all lower case, or all upper cse












    }
}
