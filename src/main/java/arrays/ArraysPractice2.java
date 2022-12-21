package arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7};
        int x = 5;
        System.out.println(containsX(arr1,x));
        System.out.println(containsX2(arr1, x));



    }

    //       create  method which takes array of int and int x
//        if array contains x, return true, else false;
//        1.for loop 2. toString, contains();
    public static boolean containsX (int [] array, int x) {

        for (int i = 0; i < array.length; i++){
            if (array [i] == x){
                return true;
            }
            }
        return false;
        }

    public static boolean containsX2( int [] array, int x){
        String str = Arrays.toString(array);

        if (str.contains(x+ "")){
            return true;
        }else{
            return false;
        }
    }
    }

