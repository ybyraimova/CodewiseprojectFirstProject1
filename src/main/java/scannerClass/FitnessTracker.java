package scannerClass;



public class FitnessTracker {
    public static void main(String[] args) {
        user user1= new user();
        user user2= new user();

//        User 1
        user1.fullName = "Tyler Durden";
        user1.gender = "male";
        user1.age = 36;
        user1.currentWeight = 87;
        user1.height = 5.11;
        user1.exercises=true;
        user1.goal= "to bulk";
        user1.dailycalorieIntake = 2700;
        user1.goalWeight = 94;

        user1.isInMood=true;
        user1.isMotivated=true;




        user1.display();
        user1.losesWeight();
        user1.bulks();
        user1.returnGoalWeight();
        user1.calculateBMI();
        user1.publishStatus(true, true);




//        User 2
        user2.fullName = "Marla Singer";
        user2.gender = "female";
        user2.age = 37;
        user2.currentWeight = 63;
        user2.height = 5.1;
        user2.exercises=false;
        user2.goal= "to shred";
        user2.dailycalorieIntake = 2300;
        user2.goalWeight = 57;

        user2.isInMood=false;
        user2.isMotivated=false;


        user2.display();
        user2.losesWeight();
        user2.bulks();
        user2.returnGoalWeight();
        user2.calculateBMI();
        user2.publishStatus(false, false);


    }
}

class user {

    //    State variables:
    String fullName;
    String gender;
    int age;
    double currentWeight;
    double height;
    boolean exercises;
    String goal;
    int dailycalorieIntake;
    double goalWeight;

    //    booleans
    boolean isMotivated;
    boolean isInMood;
    boolean losesweight;

    double BMI =((currentWeight/((height*30.48)*2))*100);


    //    methods:
    public void display() {
        System.out.println("\nFirst and Last name: " + fullName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age + " years old");
        System.out.println("Current weight is: " + currentWeight + "kg");
        System.out.println("Height is: " + height + "ft");
        System.out.println("Average calorie intake is: " + dailycalorieIntake);
        System.out.println("Goal weight is: " + goalWeight + "kg");
        System.out.println("The ultimate goal is: " + goal);
    }

    public void publishStatus(boolean isMotivated, boolean isInMood) {
        if (isMotivated && isInMood) {
            System.out.println("\n" + fullName + "'s status:SUPER confident and motivated to ROCK!");
        } else if (isMotivated && !isInMood) {
            System.out.println(fullName + "'s status: Motivated to make the progress!");

        } else if (!isMotivated & isInMood) {
            System.out.println("\n" + fullName + "'s status: In great shape to start but need motivation!");

        } else {
            System.out.println("\n" + fullName + "'s status: Want to take some time.");
        }
    }

    public boolean losesWeight() {
        boolean losesweight;
        if (dailycalorieIntake <= 2500) {
            System.out.println("\n" + fullName + " is meeting daily calorie intake to lose weight.");
            losesweight = true;
        } else {
            System.out.println("\n" + fullName + "'s daily calorie intake does not meet the recommendations for losing weight.");
            losesweight = false;
        }
        return losesweight;
    }

    public boolean bulks() {
        boolean bulks;
        if (dailycalorieIntake > 2500) {
            System.out.println("\n" + fullName + " is meeting daily calorie intake to bulk.");
            bulks = true;
        } else {
            System.out.println("\n" + fullName + "'s daily calorie intake does not meet the recommendations for gaining weight.");
            bulks = false;
        }
        return bulks;

    }

    public double returnGoalWeight() {
        System.out.println(fullName + "s' current weight is: " + currentWeight +
                "\n" + fullName + "'s ideal weight is: " + goalWeight);
        if (goal == "to shred") {
            System.out.println(fullName + " needs to lose: " + (currentWeight - goalWeight) + "kg.");
        }
        if (goal == "to bulk") {
            System.out.println(fullName+  " needs to gain: " + (goalWeight - currentWeight) + "kg.");
        }
        return goalWeight;
    }

    public double calculateBMI(){
        double BMI =((currentWeight/((height*30.48)*2))*100);
        System.out.println(fullName + "'s BMI is: " + BMI);
        if (BMI <= 16.0){
            System.out.println(fullName + "'s BMI is: " + BMI + " : Severe underweight; Please see a doctor.");
        }else if (BMI >16.0 & BMI <18.5) {
            System.out.println(fullName + "'s BMI is: " + BMI + " : Underweight (deficiency).");
        }else if (BMI >=18.5 & BMI <25.0) {
            System.out.println(fullName + "'s BMI is: " + BMI + " : Norm ");
        }else if (BMI >=25.0 & BMI <=30.0 ) {
            System.out.println(fullName + "'s BMI is: " + BMI + " : Overweight (condition preceding obesity).");
        }else{
            System.out.println(fullName + "'s BMI is: " + BMI + " : Obesity. ");
        }
        return BMI;
    }
}


