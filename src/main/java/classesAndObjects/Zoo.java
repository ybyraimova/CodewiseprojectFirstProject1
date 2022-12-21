package classesAndObjects;

public class Zoo {
    public static void main(String[] args) {
        Animal object1 = new Animal();

//  CAT (OBJECT 1)
        object1.name="Tequila";
        object1.type="The Cat";
        object1.group="Mammals";
        object1.dob=2020;
        object1.residence="house";
        object1.isMammal= true;
        object1.sleep = 18;

        object1.lives();
        object1.sleeps();
        object1.wasBorn();
        object1.isMammal =true;
        object1.isMammal();


        /*
        Animal elephant =new Animal();
         */

        Animal elephant =new Animal();
        Animal mouse =new Animal();
        Animal jiraaf=new Animal();
        Animal alligator = new Animal();
//  ELEPHANT
        elephant.name="Dumbo";
        elephant.type="The Elephant";
        elephant.group="Mammals";
        elephant.dob=2017;
        elephant.residence="zoo";
        elephant.isMammal= true;
        elephant.sleep = 10;


        elephant.lives();
        elephant.wasBorn();
        elephant.sleeps();
        elephant.isMammal=true;
        elephant.isMammal();

//  MOUSE
        mouse.name="Peter";
        mouse.type="The Mouse";
        mouse.group="Mammals";
        mouse.dob=2010;
        mouse.residence="basement";
        mouse.isMammal= true;
        mouse.sleep = 17;

        mouse.lives();
        mouse.wasBorn();
        mouse.sleeps();
        mouse.isMammal= true;
        mouse.isMammal();

//        JIRAAF

        jiraaf.name="Peter";
        jiraaf.type="The Jiraaf";
        jiraaf.group="Mammals";
        jiraaf.dob=2010;
        jiraaf.residence="basement";
        jiraaf.isMammal= true;
        jiraaf.sleep = 17;

        jiraaf.lives();
        jiraaf.wasBorn();
        jiraaf.sleeps();
        jiraaf.isMammal= true;
        jiraaf.isMammal();

//        ALLIGATOR

        alligator.name="Brad";
        alligator.type="The Alligator";
        alligator.group="Reptiles";
        alligator.dob=1995;
        alligator.residence="water";
        alligator.isMammal= false;
        alligator.sleep = 20;

        alligator.lives();
        alligator.wasBorn();
        alligator.sleeps();
        alligator.isMammal= false;
        alligator.isMammal();















    }

}
