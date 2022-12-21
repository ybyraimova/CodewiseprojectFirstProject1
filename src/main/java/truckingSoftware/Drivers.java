package truckingSoftware;

public class Drivers {
//    information about object:
    String fullName;
    int drivingExperience;
    boolean isMannualdriver;





//    methods created inside the class driver are thr actions or behavior the driver
//    type can do:

//    print info
    public void printInfo(){
        System.out.println("\nName: " + fullName);
        System.out.println("\nDriving experience: " +drivingExperience);
        System.out.println(("\nMannual engine driver: " + isMannualdriver));

    }

//    Create a method called reportAccident
//    Method should take the location from driver and print following format message
//    %driverName got in accident in %givenlocation
    public void reportAccident(String location){
        System.out.println("\n" +fullName + " got in accident in " + location);
    }

//    void method
    public void drives(String state){
        System.out.println("\n" + fullName + " is driving in " + state);
    }

//    return method for example sending location:
//    public String sendLocation(String location1){
//        System.out.println("\n" +fullName + " is in " + location1);
//        return location1;
//    }

//    or

    public String sendLocation(){
//        here you put anything you want:
        return "LA";
    }

//    method can be two of them:
//    1. returns me some data back/expecting some data back (like convert currency)- return
//    syntax: return"data type";
//     2. I dont expect smth back(f.e, display info/print out info) - void


//    create a method sendTotalLoads
//return today's number of loads'

    public int sendTotalLoads(){
        int totalLoads = 5;
        return totalLoads;

    }
}
