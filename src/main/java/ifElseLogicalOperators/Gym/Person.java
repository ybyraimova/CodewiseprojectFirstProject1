package ifElseLogicalOperators.Gym;

public class Person {

    String name;
    int age;
    double weight;
    boolean hasFreeTime;
    boolean isInMood;
    boolean hasStrongWill;
    int rating = 0;
    boolean hasExersiced;

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);

    }

    public void goesToGym(boolean hasFreeTime) {
        if (hasFreeTime) {
            System.out.println(name + " goes to gym.");
            rating++; //rating = rating +1
        } else {
            System.out.println(name + "goes to gym if no time");
            rating += 2;
        }
    }

    public void worksOut(boolean isInMood) {
        if (isInMood) {
            System.out.println(name + " works out properly.");
            rating += 2;
            hasExersiced = true; // rating = rating +2
        } else {
            rating++;
            hasExersiced = true;
            System.out.println(name + " just hangs around.");
        }


    }

    public void stayHome(boolean hasFreeTime, boolean isInMood) {
        if (hasFreeTime && isInMood) {
            System.out.println(name + "stays home even no obstacles");
            rating -= 3;
        } else if (hasFreeTime && !isInMood) {
            System.out.println(name + " has free time but not in mood and stays home.");
            rating -= 2;
        } else if (!hasFreeTime & isInMood) {
            System.out.println(name + " has no time but in mood and home");

        } else {
            System.out.println(name + " has no time, no mood");
        }
    }

    public boolean losesWeight() {
        boolean losesWeight;
        System.out.println(name + " is losing weight");
        if (hasExersiced) {
            System.out.println(name + " is losing weight");
            losesWeight = true;
        }else{
            System.out.println(name + " doesn't lose weight");
            losesWeight =false;
        }
        return losesWeight;
    }
}



