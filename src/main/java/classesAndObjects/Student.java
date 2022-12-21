package classesAndObjects;

public class Student {
//    main method - creates application

    String firstName;
    String lastName;
    byte age;
    String email;
    String major;
    short yearOfStudy;

//    method - is an action, verb, to do, functionality
    public void reads(){
        System.out.println(firstName + " " + lastName + " " + "is reading.");
    }

    public void writes(){
        System.out.println(firstName + " " + lastName + " is writing.");
    }

    public void visitsClass(){
        System.out.println(firstName + " " + lastName + " is visiting "+ major+ ".");
        //fn ln is visiting major name
    }


    boolean isHomeworkDone;
    public boolean isHomeworkDone(){
        System.out.println("Did " +firstName + " " + lastName + " completed HW? " + isHomeworkDone);
        return isHomeworkDone;
    }

}
