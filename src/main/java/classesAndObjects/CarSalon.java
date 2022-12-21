package classesAndObjects;

public class CarSalon {

        public static void main(String[] args) {
            Car Mercedes =new Car();
            Car RangeRover =new Car();
            Car Lexus =new Car();
            Car Toyota=new Car();
//        Mercedes
            Mercedes.name="Mercedes";
            Mercedes.isNewTires=true;
            Mercedes.wheel=4;
            Mercedes.windowOpen=false;
            Mercedes.lightsPowerConsumption=60.90;
            Mercedes.color="white";
            Mercedes.year= 2019;
            Mercedes.isExpensive=true;
            Mercedes.price=30000;

            Mercedes.drive();
            Mercedes.stop();
            Mercedes.cool();
            Mercedes.heat();
            Mercedes.playMusic();
            Mercedes.isExpensive();


//        Range rover
            RangeRover.name="Range Rover";
            RangeRover.isNewTires=false;
            RangeRover.wheel=4;
            RangeRover.windowOpen=true;
            RangeRover.lightsPowerConsumption=120.50;
            RangeRover.color="black";
            RangeRover.year= 2020;
            RangeRover.isExpensive=true;
            RangeRover.price=45000;

            RangeRover.drive();
            RangeRover.stop();
            RangeRover.cool();
            RangeRover.heat();
            RangeRover.playMusic();
            RangeRover.isExpensive();

//        Lexus

            Lexus.name="Lexus";
            Lexus.isNewTires=false;
            Lexus.wheel=2;
            Lexus.windowOpen=true;
            Lexus.lightsPowerConsumption=45.50;
            Lexus.color="silver";
            Lexus.year= 2015;
            Lexus.isExpensive=false;

            Lexus.drive();
            Lexus.stop();
            Lexus.cool();
            Lexus.heat();
            Lexus.playMusic();
            Lexus.isExpensive();
            Lexus.price=27000;

//        Toyota

            Toyota.name="Toyota";
            Toyota.isNewTires=true;
            Toyota.wheel=2;
            Toyota.windowOpen=false;
            Toyota.lightsPowerConsumption=27.80;
            Toyota.color="red";
            Toyota.year= 2021;
            Toyota.isExpensive=false;
            Toyota.price=19000;

            Toyota.drive();
            Toyota.stop();
            Toyota.cool();
            Toyota.heat();
            Toyota.playMusic();
            Toyota.isExpensive();



        }
    }


