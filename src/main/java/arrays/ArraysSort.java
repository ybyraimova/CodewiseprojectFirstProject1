package arrays;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        //        Arrays.sort(); will sort the array in ascending order.
        String [] strArray = { "banana", "orange", "apple", "kiwi"};
//                         ind    0          1         2        3
        Arrays.sort(strArray); //this code will sort the array in ascending order
        System.out.println(Arrays.toString(strArray)); //the output will be apple, banana, kiwi, orange.

        double [] doubleArr = new double[] { 3, 7.5, 7.1, 9, 0, 3.1, 1.2};
        System.out.println(Arrays.toString(doubleArr));
        Arrays.sort(doubleArr);
        System.out.println( "Sorted:  " + Arrays.toString(doubleArr));


        String [] string = {"FL", "NJ", "IL", "TX", "CA"};
        byte [] bytes = {9,5,6,3,2,8,1};
        int [] ints = {200, 500, 100, 300, 900, 600};
        short [] shorts = {9000, 6000, 7000, 30000, 1000, 4000};
        long [] longs = {10000000, 70000000, 200000000,54320, 1212, 9878987};
        boolean [] booleans = {true, false, true, false, true, false};
        float [] floats = {1.2f, 9.7f,6.8f, 5.5f, 3.3f};
        double [] doubles = {10, 9.9, 4.4, 2.2, 6.6, 5.5, 1};
        char [] chars = {'q', 'w', 'e', 't', 'g'};

        System.out.println("original: " + Arrays.toString(string));
        Arrays.sort(string);
        System.out.println("sorted: " + Arrays.toString(string));

        System.out.println("original: " + Arrays.toString(bytes));
        Arrays.sort(bytes);
        System.out.println("sorted: " + Arrays.toString(bytes));

        System.out.println("original: " + Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println("sorted: " + Arrays.toString(ints));

        System.out.println("original: "+ Arrays.toString(shorts));
        Arrays.sort(shorts);
        System.out.println("sorted: " + Arrays.toString(shorts));

        System.out.println("original: "+ Arrays.toString(longs));
        Arrays.sort(longs);
        System.out.println("sorted: " + Arrays.toString(longs));

        System.out.println("original: "+ Arrays.toString(booleans));
//        Arrays.sort(booleans); // it does not work for boolean
        System.out.println("sorted: " + Arrays.toString(booleans));

        System.out.println("original: "+ Arrays.toString(floats));
        Arrays.sort(floats);
        System.out.println("sorted: " + Arrays.toString(floats));

        System.out.println("original: "+ Arrays.toString(doubles));
        Arrays.sort(doubles);
        System.out.println("sorted: " + Arrays.toString(doubles));

        System.out.println("original: "+ Arrays.toString(string));
        Arrays.sort(string);
        System.out.println("sorted: " + Arrays.toString(string));

        System.out.println("original: "+ Arrays.toString(chars));
        Arrays.sort(chars);
        System.out.println("sorted: " + Arrays.toString(chars));



    }
}
