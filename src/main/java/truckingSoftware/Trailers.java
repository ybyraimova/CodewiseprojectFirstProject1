package truckingSoftware;

public class Trailers {
    String vinNumber;
    int year;
    boolean isMannual;

//    methods:

    public void printInfo() {
        System.out.println("VIN number: " + vinNumber);
        System.out.println("Year: " + year);
        System.out.println(("Mannual engine type: " + isMannual));
    }

}
