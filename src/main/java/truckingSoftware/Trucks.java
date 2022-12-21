package truckingSoftware;

public class Trucks {
    String vinNumber;
    int year;
    boolean isMannual;

//    Methods:

    public void printInfo() {
        System.out.println("VIN number: " + vinNumber);
        System.out.println("Year: " + year);
        System.out.println(("Mannual engine type: " + isMannual));
    }
}
