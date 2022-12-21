package classesAndObjects;

public class Animal {
    String name;
    String group;
    int dob;
    String residence;
    boolean isMammal;
    byte sleep;
    String type;

    public void lives(){
        System.out.println(type + " "+ name + ", belonging to "+group + ", lives in " + residence);
    }

    public void wasBorn(){
        System.out.println(name + " was born in " + dob);
    }

    public void sleeps(){
        System.out.println(name + " sleeps " + sleep + " hours a day.");


    }

//    Return type:
    /*
    void , byte, short, boolean, byte, string, int, => only one option
     */


    public boolean isMammal(){
        System.out.println(name + " is a mammal " + isMammal);
        return isMammal;
    }
}
