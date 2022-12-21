package dataTypes;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Variables {
    public static void main (String [] args){
        System.out.println("My name is Aichurok");

        //TOPIC for today: HOW TO ASSIGN DATA TYPES
        //1. choose data type (i.e. Byte, Int or other; 2. give  a name to a data type (i.e. YoungAge);
        // 3.assign a value to a data type (variable) (i.e. =18, =200, =abc)
        //PRIMITIVE DATA TYPE:

        //--------------BYTE--------------------------------------//
        // byte can store values from -128 to 127
        byte a = 12;
        System.out.println(a);
        byte b = 127;
        System.out.println("first value of b: "+ b);
        // "first value of b: " - is the comment you want to add up to the variable in console.
        b = 23;
        //this is how you reassign the variable b from 127 to 23 (change from one value to another)
        System.out.println("second value of b: " +b );
        byte myAge = 27;
        System.out.println(myAge);
        System.out.println("My age is " + myAge);

        //---------------SHORTS----------------------------------//
        // Short stores whole numbers from -32 768 to 32 767
        short youngAge = 18;
        System.out.println("my age is " + youngAge);
        short Price = 30000;
        System.out.println(Price);
        System.out.println("The price is " + Price);

        //---------------INT (Integer)----------------------------------//
        //Int store whole numbers  -2 147 483 648 to 2 147 483 647//
        int TransactionID = 202020202;
        System.out.println("Transaction ID is " + TransactionID);
        //Change value in variable:
        TransactionID = 1010101010;

        //New int:
        int TransactionID1 = 1201207694;
        System.out.println("Transaction number one is " + TransactionID1);

        int  CardNumber = 2000000000;
        System.out.println(CardNumber);
        System.out.println("My card number is " + CardNumber);



        //---------------LONG----------------------------------//
        //Long stores whole numbers -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807//
        //Java doesn't want us to store bigger number because it takes a lot of memory.
        long AccountNumber = 9223372;
        System.out.println("My account number is " + AccountNumber);

        //---------------DOUBLE----------------------------------//
        //Double data type stores decimal values with 15-16 digits and whole  number as well//
        double CheckID = 922337203.10398483749834893749746649487464849476659597364948656893d;
        System.out.println("CheckID is " + CheckID);

        double InterestRate1 = 17.25;
        System.out.println(InterestRate1);
        System.out.println("The interest rate of Optima Bank is " + InterestRate1 + "%.");


        //---------------FLOAT----------------------------------//
        //Float stores whole numbers Float fractional numbers (десятичные числа) 6 to 7 decimal digit numbers//
        //we need to tell to JAVA that it is a float number: add "f" in the end of the number:
        float Height = 32111111198891838.51010010101010f;
        System.out.println("My height is " + Height);

        float TransactionNumber = 2983843474.7836483772374f;
        System.out.println(TransactionNumber);
        System.out.println("Transaction number is " + TransactionNumber);



        //---------------CHAR(character)----------------------------------//
        //Char stores one character from ASCII table. Always put special character or letter inside single quotes//
        char letter = 'H';
        char Spec = '/';
        char digit = '5';
        char digit1 = '7';
        System.out.println("Char values: " + letter + digit + Spec +  digit1);
        System.out.println("Char values: " + letter + Spec + digit + digit1);

        char letter1 = 'B';
        char symbol = '&';
        char number = '2';
        System.out.println("Это будет:" + letter1 + symbol +number);


        //---------------BOOLEAN----------------------------------//
        //Boolean stores only two values TRUE or FALSE//
        boolean FloridaIsCapitalOfUSA = false;

        boolean NYIsABigcity = true;
        System.out.println( FloridaIsCapitalOfUSA);
        System.out.println( NYIsABigcity);

        boolean LessonFinished = false;




        //NON-PRIMITIVE DATA TYPE
        //--------------STRING------------------------------------//
        //Any text can be put under string
        String Name = "Codewise Academy is in";
        String LastName = "Chicago";
        //String Concanetation when two variables add "space" to put space between two values
        System.out.println(Name + " " + LastName);
        System.out.println("Hello, student! " + Name + " " + LastName + ". You are welcome to our office!");

        String Name1 = "Айчурок";
        String LastName1 = "Ыбыраимова";
        System.out.println(Name1 + " "+ LastName1);
        System.out.println("Меня зовут " + Name1 + " " + LastName1);



        //----------Concanetation------------//
        byte Mybyte = 12;
        int myInt = 23;
        double mydouble = 8989;
        String myName = "Aichurok";
        String mycity = "Florida";
        System.out.println("Hello!"+ myName + " "+"lives in" + " "+ mycity +" " + "on" +" " + Mybyte + " " +"Street.");
        System.out.println("" + 12 + 23);
        System.out.println("" + 20 + 40);



        //In class Assignment:
        byte NumberofDEsk = 15;
        System.out.println("My desk number is "  +  NumberofDEsk);
        short Waitingnumber = 3509;
        System.out.println("My Waiting number is " + Waitingnumber);
        int Creditcardnumber = 390907883;
        System.out.println("My Credit car number is "  +  AccountNumber);
        long TransactionNumber1 = 1234108901;
        System.out.println("The transaction number that I have a question about is " + TransactionNumber1);
        double Interestrate = 12383.9383;
        System.out.println("Interest rate is " + Interestrate + "%");
        float Annualinterestrate = 12.9078099098f;
        System.out.println("Annual interest rate is " + Annualinterestrate + "%");
        boolean Problemsolved = false;
        System.out.println("The problem was solved " + Problemsolved);
        String city = "Chicago";
        System.out.println(city + " " + "is the fourth biggest city in the USA.");
        System.out.println("Hello, my name is Aichurok. I am from" + " " + city + ".");

        String firstName = "Aichurok";
        String lastName = "Ybyraimova";
        System.out.println(firstName + " " + lastName);





        byte b1 =100;
        short s =123;
        int v = 123543;
        int calc = -9876345;
        long amountVal = 1234567891;
        float interestRate = 12.25f;
        double sineVal = 12345.234d;
        boolean flag = true;
        boolean val = false;
        char ch1 = 88;
        char ch2 = 'Y';

        System.out.println("byte Value = "+ b1);
        System.out.println("short Value = "+ s);
        System.out.println("int Value = " + v);
        System.out.println("calc Value = " + calc);
        System.out.println("amountVal ="  + amountVal);
        System.out.println("interestRate = " + interestRate);
        System.out.println("sineVal = " + sineVal);
        System.out.println("flag = " + flag);
        System.out.println("val = " + val);
        System.out.println("ch1 = " +ch1);
        System.out.println("ch2 = "+ ch2);









        byte NumberofCelebrities = 20;
        System.out.println("There are" + " "+ NumberofCelebrities + "celebrities in the show.");
        short NumberofPeople = 25000;
        System.out.println("There are" + " "+ NumberofPeople + " " + "in the hall.");
        int NumberofInteractions = 15000000;
        System.out.println("People interacted with each other " + NumberofInteractions + " times");
        long Donation = 1000000000;
        System.out.println("They donated " + Donation + "$" + " for charity");
        char Nickname = 'B';
        System.out.println("She goes by " + Nickname);
        boolean HerNameisB = true;
        System.out.println(HerNameisB);
        float BHeight = 5.5f;
        System.out.println("Her height is " + BHeight);
        double Regression = 56.12345678987654;
        System.out.println("The statistics shows " + Regression + "%.");
        String Java = "This is Java Language!";
        System.out.println(Java);
        System.out.println(NumberofCelebrities+ " " +NumberofPeople +" " +NumberofInteractions + " " +Donation + " " +Nickname + " " +HerNameisB + "  "+ BHeight + " " + Regression  + " " + Java );





    }
}
