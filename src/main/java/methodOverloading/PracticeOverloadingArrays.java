package methodOverloading;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PracticeOverloadingArrays {
    /*
    create rotate method which takes:
    arrays of ints;
    string rotate;

    if rotate == left: 1,2,3 => 2,3,1
    if rotate == right: 1,2,3 => 3,2,1
     */
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        int[] ints2 = {4, 5, 6};
        String right = "right";
        String left = "left";
        System.out.println(Arrays.toString(rotate(ints, right)));
        System.out.println(Arrays.toString(rotate(ints, left)));

        System.out.println(Arrays.toString(rotate(ints, left, true)));
        System.out.println(Arrays.toString(rotate(ints, left, false)));


        reverse("apple");
        reverse("orange", true);
        reverse("orange", false);



    }

    public static int[] rotate(int[] array, String rotate) {
        if (rotate.equals("left")) {
            return new int[]{array[1], array[2], array[0]};

        } else if (rotate.equals("right")) {
            return new int[]{array[2], array[1], array[0]};
        }
        return array;
    }


    public static int[] rotate(int[] array, String rotate, boolean goRotate) {
        if (goRotate) {
            if (rotate.equals("left")) {
                return new int[]{array[1], array[2], array[0]};
            } else if (rotate.equals("right")) {
                return new int[]{array[2], array[1], array[0]};
            }

        }
        return array;
    }

    /* create a method which takes string
    and returns reversed  String
    apple ==> elppa
    chicago => agacihc
     */
    public static String reverse(String str) {
        System.out.println("original word: " + str);
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("reversed word: " + reversed);
        return reversed;
    }

    public static String reverse(String str, boolean isReversed) {
        System.out.println("original word: " + str);
        String reversed = "";
        if (isReversed) {
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed = reversed + str.charAt(i);
            }
            System.out.println("reversed word: " + reversed);
            return reversed;
        }
        return str;
    }

    /*
    create method, take Sting str1, boolean b, string str2,
    if b =true, reverse both strings, return concatenated string , str 1 + str 2

     */

//    public static String reverse(String str1, String str2, boolean b) {
//        System.out.println("original words: " + str1 + " and " + str2);
//        if(b){
//            String reversed1 = "";
//            String reversed2 = "";
//            for (int i = str1.length() - 1; i >= 0; i--) {
//                reversed1 = reversed1 + str1.charAt(i);
//            }
//            System.out.println(
//                    "reversed word: " + reversed);
//            return reversed;
//        }
//        return str;
//    }

//    public static String reverse(String str, boolean b) {
//        if (b) {
//            String result = "";
//            for (int i = str.length() - 1; i >= 0; i--) {
//                result = result + str.charAt(i);
//            }
//            System.out.println(result);
//            return result;
//        }
//        return str;
//    }



}



