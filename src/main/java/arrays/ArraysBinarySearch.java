package arrays;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        String [] strArr = {"N", "la", "FL", "4"};
        int index = Arrays.binarySearch(strArr, "la");
        System.out.println(index);
        System.out.println(Arrays.binarySearch(strArr, "N"));

        int index2= Arrays.binarySearch(strArr, "4");
        System.out.println(index2);
    }
}
