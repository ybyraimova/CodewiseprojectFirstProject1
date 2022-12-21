package arrays;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String [] strArrray1 = { "Good", "Morning", "Everyone"};
        String [] strArrray2 = { "Good", "Morning", "Everyone"};
        String [] strArrray3 = strArrray1;
        System.out.println(strArrray1); //[Ljava.lang.String;@36baf30c - this is the object ID
        System.out.println(strArrray2); //[Ljava.lang.String;@7a81197d  - this is the object ID
        System.out.println(strArrray3); // [Ljava.lang.String;@36baf30c - this is the object ID - pointing at the existing
//        object ID. It's referencing to the existing object.


//        Arrays.toString(arr) method converts all values of array into one string.
        System.out.println(Arrays.toString(strArrray1));
        System.out.println(Arrays.toString(strArrray2));
        System.out.println(Arrays.toString(strArrray3));


        int [] intArray = {1,2,3,4,5,6,7,8,9,0};
        String str = Arrays.toString(intArray); //this code converting int array to a regular string
        System.out.println(str);


//        create 9 arrays of different data types. put some values. print the values suing toString method:

        String [] string = {"Hello", "World!"};
        byte [] bytes = {1,2,3,4,5};
        int [] ints = {200,300,400,500};
        short [] shorts = {10000,20000,30000};
        boolean [] booleans = {true, false, true, false};
        char [] chars = {'q', 'w', 'e', 'r', 't', 'y'};
        long [] longs = {50000, 600000, 7000000, 80000000};
        float [] floats = {1.2f, 3.4f, 5.6f, 7.8f};
        double [] doubles = {1.0, 1.5, 1.7, 1.8, 1.9};

        System.out.println(Arrays.toString(string));
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(shorts));
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(longs));
        System.out.println(Arrays.toString(floats));
        System.out.println(Arrays.toString(doubles));

//
//        public int[] reverse3(int[] nums) {
//            return new int [] {nums[2], nums[1], nums[0]};
//
////        }
//
//
//        public int sum2(int[] nums) {
//            if (nums.length ==0){
//                return 0;
//            } else if (nums.length ==1){
//                return nums[0];
//            }
//            return nums[0] + nums[1];
//
//        }
    }




    public int[] makeEnds(int[] nums) {
        if (nums.length == 1){
            return new int [] {nums[0], nums[0]};
        }
        else if (nums.length == 2){
            return nums;
        }
        return new int []{nums[0], nums[nums.length-1]};

    }


    }

