package ifElseLogicalOperators;

public class AndOperator {
    public static void main(String [] args){
        int money= 25;


        String cake1 = "honeycake";
        int costOfTheCake1=20;
        boolean isGlutenFree1=true;


        String cake2="cheesecake";
        int costOfTheCake2=25;
        boolean isGlutenFree2=false;

        /*
        1. I want to buy a gluten-free cake and I have only 25 dollars.
        2. I can buy non-gluten-free cake only if its less than 15 dollars.
         */

        if (isGlutenFree1 &&costOfTheCake1 <= money){
            System.out.println("I will buy the: " + cake1);
        } else if (!isGlutenFree2 && costOfTheCake2<15) {
            System.out.println("I will buy the non gluten free " + cake2);

        }else if(!isGlutenFree2 && costOfTheCake2 > 15 && cake2.equals("cheesecake")){
            System.out.println("I will  buy the cake if it is not gluten free, but its a cheesecake");

            }

        /*
        && - it will check for all conditions
        true && true && true  --> true
        false && true & true --> false
        & it will

         */



        }


    }
