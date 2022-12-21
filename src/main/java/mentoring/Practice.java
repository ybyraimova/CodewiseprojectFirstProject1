package mentoring;

public class Practice {
    public static void main(String[] args) {
        String city = "Chicago ";
        System.out.println(city.substring(2,5)); //the beginning index is always included and end index is not  (exclusive)
        System.out.println(city.length());
        city.trim(); //not catching the new value
        city = city.trim(); // catching the new value
        System.out.println(city.length());

        String state= "Washington";
        state.substring(1,5);
        byte c= (byte) state.indexOf('W');

//        city.indexOf();
//        pulls out a character from index of the position in a string
//                takes char
//                returns integer index

//        city.charAt();
//        returns char at a given index
//                takes index
//                 returns char

//        city.startsWith();
//        pulls out a boolean which tells whether the string starts with the specified string
//                takes string
//                returns boolean


//        city.isEmpty()
//                pulls out a boolean which tells whether the string is empty or not
//                takes nothing
//                returns booleans


//        city.replace()
//                it replaces one char by another
//                takes old and new char
//                 returns char


        String text = "I really love programming";
//        cut the prog from this sentence using indexof method and  substring
//        when you use string in index of it returns the index of first letter
//        for example text.indexof("program")

        int sub = text.indexOf("program");
        System.out.println(sub);
        int last = text.indexOf("gram");
        System.out.println(last);

        String newString = text.substring(sub, sub+4); // this is the alternative way



        String substring = text.substring(14,18);
        System.out.println(substring);






        String sentence = "This is a great code!";
        //REPLACE I WITH A
        String s = sentence.replace('i','a' );
        System.out.println(s);
        s= sentence.replace("great","bad");
        System.out.println(s);
        s= sentence.replaceAll("Thas is a bad code!", "THANK YOU");
        System.out.println(s);
















    }


}
