package classesAndObjects;

public class School {
    public static void main(String[] args) {
        Student object1 = new Student();
        Student object2 = new Student();
//Object 1 values assigned, print out
        object1.firstName="Gulmira";
        object1.lastName="Aibekova";
        object1.age=21;
        object1.email="gulmira@gmail.com";
        object1.major="BA";
        object1.yearOfStudy=2020;

        System.out.println(object1.firstName);
        System.out.println(object1.lastName);
        System.out.println(object1.age);
        System.out.println(object1.email);
        System.out.println(object1.major);
        System.out.println(object1.yearOfStudy);

// Object 2 values assigned, print out

        object2.firstName="Aichurok";
        object2.lastName="Ybyraimova";
        object2.age=27;
        object2.email="aichurok@gmail.com";
        object2.major="Sociology";
        object2.yearOfStudy=2016;


        System.out.println("Name " + object2.firstName);
        System.out.println(object2.lastName);
        System.out.println(object2.age);
        System.out.println(object2.email);
        System.out.println(object2.major);
        System.out.println(object2.yearOfStudy);

//        Let's call object 1 and ask her to do smth:

        object1.reads();
        object1.writes();
        object1.visitsClass();

        object2.reads();
        object2.writes();
        object2.visitsClass();

//        method is java:
//        public - create; void - nothing;
//        public void giveTheNameofTheMethod(){ BODY INSIDE} -rule:
        /*
        public void read(){
        }

        public void study (){

        }

        public class NameOfTheClass{
        }

         */

        object1.isHomeworkDone = true;
        object2.isHomeworkDone = false;
        object1.isHomeworkDone();
        object2.isHomeworkDone();







    }
}
