package stringManipulation;

public class CharAt {
    public static void main(String[] args) {
/*
    CharAt(450) is a method that returns integer
    it belongs to String class and can only be used by String
    it will return us char of an index;
 */
        String name = "Angelina";
        /*
        A=0
        n=1
        g=2
        e=3
        etc
         */
        char a=name.charAt(3); //return e
        System.out.println(a);

        String text= "Hello everyone! Hope you are doing well. I wish you all good luck and at least 120k salary";

//        Length() returns number of characters in the string
//        returns int and can be only used by String
//        is the only method that starts with 1
        System.out.println("the number of letters: " +text.length());

        String Speech = "fkjnvdfjklmvkfjbnlfkdnvkjdfbnvdfjklbkfdh";
        System.out.println(Speech.length());




        String school = "Harvard";
        String anotherschool="Stanford";

        System.out.println(school.charAt(0));
//        when you want to know whats the last letter of a a big text or a word and you do not
//        know the lenght
        System.out.println(anotherschool + "'s last letter is: " +
                anotherschool.charAt(anotherschool.length()-1));


        String qwerty= "ahjsdklforieuywgsbdfnmg,lrieuhdbfnmk";
        System.out.println(qwerty.charAt(qwerty.length()-1));



        String s = "Java String Quiz";
        System.out.println(s.charAt(s.toUpperCase().length()-1));
//      how to print out the last letter in uppercase:
        String lastLetter = s.charAt(s.length()- 1) + "";

        System.out.println(lastLetter.toUpperCase());






        String g1 = "abc";
        String g2 = "abc";
        boolean g3= g1==g2;
        System.out.println(g3);



        String q = "Java"+1+2+"Quiz"+""+(3+4);
        System.out.println(q);



        String s1 = new String("java");
        String s2 = new String("JAVA");
        s2 = s2.toLowerCase();
        System.out.println(s1 = s2);



        String fg = "Java String Quiz";
        System.out.println(fg.charAt(fg.toUpperCase().length()-1));





    }


}
