package GroceryStore;

public class Market {
    public static void main(String[] args) {
        Seller amazon = new Seller();
//        to access and make changes to object attributes : name.(dot)
        amazon.storeName="Amazon";
        amazon.phoneNumber="9415009040";

//        \n -nextline;
//        \t - tab; both can be used before the text
        amazon.email="amazon@amazon.com";
        amazon.isHalal=true;
        amazon.numberOfEmployees=34;

        System.out.println(amazon.storeName);
        System.out.println(amazon.phoneNumber);
        System.out.println(amazon.email);
        System.out.println(amazon.isHalal);
        System.out.println(amazon.numberOfEmployees);

//        Create another store:
        Seller zara = new Seller();
        zara.storeName="Zara";
        zara.phoneNumber="94155969040";
        zara.email="Zara@zara.com";
        zara.isHalal=false;
        zara.numberOfEmployees=100;


        System.out.println("\n"+ zara.storeName);
        System.out.println(zara.phoneNumber);
        System.out.println(zara.email);
        System.out.println(zara.isHalal);
        System.out.println(zara.numberOfEmployees);

//        how to change value of attribute:


//        New store:
        Seller costco = new Seller();
        costco.storeName="Costco";
        costco.phoneNumber="941559123040";
        costco.email="costco@costco.com";
        costco.isHalal=false;
        costco.numberOfEmployees=120;


        System.out.println("\n"+ costco.storeName);
        System.out.println(costco.phoneNumber);
        System.out.println(costco.email);
        System.out.println(costco.isHalal);
        System.out.println(costco.numberOfEmployees);

//        digitalize water

        Water water = new Water();
        water.name="Legend";
        water.type="Mineral";
        water.price=5;
        water.isImported=false;

        System.out.println("\n"+ water.name);
        System.out.println(water.type);
        System.out.println(water.price);
        System.out.println(water.isImported);

//or you can use display method:

        System.out.println("\n");
        amazon.display();
        System.out.println("\n");
        zara.display();
        System.out.println("\n");
        costco.display();
    }

}
