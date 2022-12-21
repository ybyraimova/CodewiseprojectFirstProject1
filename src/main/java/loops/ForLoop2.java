package loops;

public class ForLoop2 {
    public static void main(String[] args) {
//        Create a loop that will print numbers 0-30.
//        if a number can be divided by 3, add number = divisible
        for(int i = 0; i <= 30; i++){
            if (i % 3 == 0){
                System.out.println(i + " divisible by 3 ");
            }else{
                System.out.println(i);
            }

        }

//

    }
}
