package truckingSoftware;

public class truckSoft {

    public static void main(String[] args) {
//        there is a rule to create an object:
//        Class name + object name = new + Class name();

//        DRIVERS:

//        Drivers 1
        Drivers driver1 = new Drivers();
        driver1.fullName = "Cristiano Ronaldo";
        driver1.drivingExperience = 12;
        driver1.isMannualdriver = true;


//        call methods:
        driver1.printInfo();
        driver1.reportAccident("Ohio");
        driver1.drives("Chicago");
//        driver1.sendLocation("Florida");
//        the following is not going to print out anything in console:
        driver1.sendLocation();
//        catching the data from return method:
        String location = driver1.sendLocation();

        System.out.println(location);


//        total loads:
//        this one is not going to print out:
        driver1.sendTotalLoads();


//  this is how you catch return value (catch data with the same data type, otherwise you will lose the data/result:
        int totalLoads = driver1.sendTotalLoads();
//        this is how you print it put:
        System.out.println(totalLoads);



//        Driver 2

        Drivers driver2 = new Drivers();
        driver2.fullName = "Patrizia Gucci";
        driver2.drivingExperience = 2;
        driver2.isMannualdriver = false;


//        call methods:
        driver2.printInfo();
        driver2.reportAccident("Chicago");






        //    TRUCKS
        Trucks truck1 = new Trucks();
        truck1.vinNumber = "AC129fmn6000";
        truck1.year = 2013;
        truck1.isMannual = true;


//    TRAILERS

    }



// Method signature:
//    -access modifier;
//    -return type;
//    1. Void: the void method does NOT return anything back when it's called.

}
