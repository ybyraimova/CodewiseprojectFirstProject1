package arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        /*
        create array of strings - groceryList with length of 5.
        assign values to each element.
        print all elements:
         */
        String [] groceryList = new String[5];
        groceryList = new String[]{"apples", "milk", "cereal", "greeknuts", "bakingpowder", "plain youghurt"};
        System.out.println("I am going to buy:");
        for (int i= 0; i < groceryList.length; i++) {
            System.out.print(groceryList[i] + ", ");

        }
        System.out.print("\n");

//            ========

        for(int j= 0; j < groceryList.length; j++){
                System.out.println(j + 1 + ") "+ groceryList[j]);
            }

        char [] array = new char []{ 'c', 'o', 'd', 'i', 'n', 'g', ' ', 'i', 's', ' ', 'g', 'r', 'e', 'a', 't'};
        for(int i =0; i < array.length; i++){
            System.out.print(array[i]);
        }

//        create array of strings colors. add 7 colors. print all colors if color is equal to yellow or green do not print

        System.out.println("\n");
        String [] colors = new String[]{"yellow", "green", "red", "black", "purple", "pink", "white", "blue"};

        for (int i=0; i< colors.length; i++){
            if(!colors[i].equals("yellow")|| !colors[i].equals("green")){
                System.out.println(colors[i]);
            }
        }
        System.out.println("\n");

        for (int f=0; f< colors.length; f++){
            if(colors[f].equals("yellow")|| colors[f].equals("green")){
                continue;
            }
            System.out.println(colors[f]);
        }

        int [] ints = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i= 0; i < ints.length; i++){
            if (ints[i] == 3 || ints[i] == 8) {
                continue;
            }
            System.out.println(ints[i]);
        }

        double [] arrays = new double[]{1.5, 2.0, 2.5,3.0, 3.5, 4.0, 4.5, 5.0, 5.5,6.0};
        for (int l=0; l< arrays.length; l++){
//            we want to ignore printing all values from index 5 to 8:
            if (l>=5 && l<=8) {
                    continue;
                }
            System.out.print(arrays[l] + ", ");
            }

        }



        }




