package arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        String [] animals = {"elephant", "lion", "wolf", "giraffe"};
        String animal1 = animals[0];
        String animal2 = animals[1];
        String animal3 = animals[2];
        String animal4 = animals[3];

        System.out.println(animal1);
        System.out.println(animals[2]);
        System.out.println(animals[10-8+1]);
        System.out.println(animals[animals.length -2]);//wolf
//        fibonacci numbers are the sequence of numbers where two numbers are followed by their sum.
        int[] fibonacciNumbers = {1,1,2,3,5,8,13,21,34,55};

        int num1 = fibonacciNumbers[2];
        num1 = fibonacciNumbers[5];
        int num2 = fibonacciNumbers[0];
        int num3 = fibonacciNumbers[fibonacciNumbers.length-5];
        System.out.println(num3);

//        array is a fixed size collection
//        you cannot change the length of an array once it was specified.

//        ===================
//        creating declaring array which will store 5 values, but ut doesn't have values yet.
        String [] cities = new String[5];

//      this will print null because it doesn't have a value assigned yet.
        System.out.println(cities[0]);

        cities[0] = "Los Angeles";
        cities[1] = "Paris";
        cities[2] = "Rome";
        cities[3] = "Dubai";
        cities[4] = "Tokyo";
//        you can only have values from 0 to 4, because the index starts with 0.

        System.out.println(cities[0]);
//        if you want to print out every value in array you have to use loop:
        for (int i = 0; i < cities.length; i++){
            System.out.println(cities[i]);
        }
//        if you want to change the value in array (reassign):
//        but the size of array can never be changed
        cities[3] = "Kuala-Lumpur";

        String [] countries; //java
//        or
        String states [];  // c++ way
        countries = new String[]{ "USA", "Argentina", "Italy", "Japan", "", null, "Ukraine"}; // its 7 elements(size is 7)
        countries[countries.length-1] = "Singapore";
        countries[5] = "Kazakhstan";

        double [] prices = {1.99, 2.99, 4.99, 20.99, 99.99};
        double [] longArray = {12345, 123e4, 12345678, 1234567898, 112321};
        boolean [] booleans = {true, true, false, false};
        char [] chars = {'r', 'f', '1', 'd', 'q', '/', 9, 127, 1290, 65535 }; //char array can store up to 2^16-1 number
//        which is equal to 65535.

        byte [] numbers = {1,2,3,4,5,6,7,8};
        for(int i= 0; i< prices.length; i++){
            System.out.println(prices[1]);
        }
//        ========================
        String [] berries = new String[5];
        String [] fruits = new String[]{"", "", "", "", ""};

        int [] numbs = new int[5];
        int [] newNumbs = new int []{0,1,2,};


//  create your own arrays:
        String [] inditex = new String[5];
        inditex = new String[]{"Massimo Dutti", "Zara", "Bershka", "Pull&Bear", "Stradivarius", "OYSHO"};

        double [] sharePrices = {134.90, 90.5, 200.77, 44.32, 5.20, 4};
        int [] age = {20, 25, 30, 40, 50, 21};
        byte [] position = { 1,2,3,4,5,6,7,8,9,10};
        char [] specialCharacters = { '!', '@', '#', '$', '%', '^', '&', '*', '?'};
        boolean [] guess = {true, false, true, false, true, false};

//
//        public int [] makepi (){
//            return int []{3,1,4}
//        }










    }
}
