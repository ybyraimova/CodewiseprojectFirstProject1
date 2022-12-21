package classesAndObjects;


public class Family {
    public static void main(String[] args) {
//        1. Apako
        Members apako = new Members(); // created an object

        apako.name= "Apakov";
        apako.age = 72;
        apako.gender = "female";
        apako.isTall = false;

//        2. Ata
        Members ata = new Members();

        ata.name= "Ata";
        ata.age = 72;
        ata.gender = "male";
        ata.isTall = true;

//        Bika
        Members bika = new Members();

        bika.name= "Bika";
        bika.age = 14;
        bika.gender = "female";
        bika.isTall = false;


//        Display objects:
        //        \n -nextline;
//        \t - tab; both can be used before the text

        System.out.println("\n"+ "Family member name is + " +  apako.name);
        System.out.println(apako.age);
        System.out.println(apako.gender);
        System.out.println(apako.isTall);

        System.out.println("\n"+ata.name);
        System.out.println(ata.age);
        System.out.println(ata.gender);
        System.out.println(ata.isTall);

        System.out.println("\n"+ bika.name);
        System.out.println(bika.gender);
        System.out.println(bika.age);
        System.out.println(bika.isTall);

        bika.reads();
        ata.sleeps();
        apako.eats();
    }
}
