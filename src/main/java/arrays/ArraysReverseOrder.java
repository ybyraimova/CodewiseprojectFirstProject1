package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArraysReverseOrder {
    public static void main(String[] args) {
        Integer [] intArray = {5,6,7,1,2,3,4};
        Arrays.sort(intArray); // sorted in ascending order
        System.out.println("ascending: " + Arrays.toString(intArray));

        Arrays.sort(intArray, Collections.reverseOrder()); //sorted in descending order
        System.out.println("descending: " + Arrays.toString(intArray));

        /*
        String, char, double
         */

        String [] string = { "Naryn", "Bishkek", "Osh", "Jalal-Abad", "Chui"};
        Arrays.sort(string);
        System.out.println("Ascending: " + Arrays.toString(string));

        Arrays.sort(string, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(string));

        Character [] chars = {'a', 's', 'h', 't', 'c'};
        Arrays.sort(chars);
        System.out.println("Ascending: " + Arrays.toString(chars));

        Arrays.sort(chars, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(chars));


        Double [] doubles = {1.5, 0.4, 0.1, 2.5, 0d, 1d};
        Arrays.sort(doubles);
        System.out.println("Ascending: " + Arrays.toString(doubles));

        Arrays.sort(doubles, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(doubles));


        sortInt(new int[]{2, 3, 10, 9, 5, 21}); //this one doesn't have reference ID/ it cannot be reused

        int [] arr1 = {3,6,8,9,2,0}; //this is saved and can be reused.
        sortInt(arr1);

        String [] str1 = {"red", "blue", "black", "white", "brown"};
        sortString(str1);

        sortString(new String[] { "a", "hello", "code", "work"});


    }
    public static int [] sortInt(int [] arr){
        Arrays.sort(arr);
        System.out.println("Ascending sort int method: " + Arrays.toString(arr));
        return arr;
    }

    public static Integer [] reverseInt(Integer [] arr1){
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println("Descending sort int method: " + Arrays.toString(arr1));
        return arr1;
    }

    public static String [] sortString(String [] str){
        Arrays.sort(str);
        System.out.println("Ascending sort string method: " + Arrays.toString(str));
        return  str;
    }
    public static String [] reverseStringArr(String [] str){
        Arrays.sort(str, Collections.reverseOrder());
        System.out.println("Descending sort string method: " + Arrays.toString(str));
        return str;
    }
}
