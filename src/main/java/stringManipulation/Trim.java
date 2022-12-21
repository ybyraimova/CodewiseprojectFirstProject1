package stringManipulation;

public class Trim {
    public static void main(String[] args) {
//        Trim() removes any empty space from string before and after string nut not in middle
    String shop = "Amazon ";
        System.out.println(shop.trim());

        String anotherShop="       Whole    foods   ";
        System.out.println(anotherShop.length());
        System.out.println(anotherShop.trim());
        System.out.println(anotherShop.length());


//        home assignment:
        String shop1= "    M  arianos"; //remove empty space in word
        shop1= shop1.trim();






    }
}
