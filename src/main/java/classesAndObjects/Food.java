package classesAndObjects;

public class Food {
    String name="plov";
    String temperature="warm";

    public static void main(String[] args) {
        Food food = new Food();
        food.name="pizza";
        food.temperature="cold";
        System.out.println(food.temperature + " " + food.name);
    }

}

