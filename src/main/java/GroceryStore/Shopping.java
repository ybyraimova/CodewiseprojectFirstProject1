package GroceryStore;

public class Shopping {
    public static void main(String[] args) {
        Buyer buyer= new Buyer();
        buyer.fullName = "James Bond";
        buyer.address = "123 Main ST";
        buyer.email = "james@gmail.com";
        buyer.isResident = true;
        buyer.age = 43;

//        How to print out:
        buyer.display();
//        buyer.updateResidency(newResidency:true);

    }

}
