package arrays;

import java.util.Arrays;

public class ArraysCopyOf {
    public static void main(String[] args) {
        int [] intArr1 = {1,2,3,4,5};
        int [] intArr2 = intArr1;



        String [] strArr1 = {"hello", "hi", "gfv", "fdkf"};
        String [] strArr2 = Arrays.copyOf(strArr1, strArr1.length); //this is just the copy. the object reference is diff.
        String [] strArr3 = Arrays.copyOf(strArr1, 1);



    }
}
