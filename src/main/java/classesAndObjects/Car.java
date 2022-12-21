package classesAndObjects;

import java.util.logging.SocketHandler;

public class Car {
    String name;
    boolean isNewTires;
    byte wheel;
    boolean windowOpen;
    double lightsPowerConsumption;
    String color;
    short year;
    boolean isExpensive;
    int price;

    public void drive(){
        System.out.println(name + " has new tires " + isNewTires );
    }

    public void stop(){
        System.out.println("The number of wheels used to stop " + name  +" : " + wheel);
    }

    public void heat(){
        System.out.println("When heat is on windows must be closed in " + name + " : " + windowOpen);
    }

    public void cool(){
        System.out.println("Windows must be open to cool inside " + name + " : " + windowOpen);
    }

    public void playMusic(){
        System.out.println(name + " " + year + " "+ color + " "+ price+ "$ "+ " has audio acuostic.");
    }

    public boolean isExpensive(){
        return isExpensive;
    }


}


