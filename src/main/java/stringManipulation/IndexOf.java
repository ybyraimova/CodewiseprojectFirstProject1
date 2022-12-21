package stringManipulation;

public class IndexOf {
    public static void main(String[] args) {
        String str = "abcdfg";
        System.out.println(str.charAt(3));
        /*
        CharAt( int index) takes and integer and returns char behind that integer and
        can be used only by string. it returns char
         */

        /*
        indexOf(char c), method belongs to String class. it takes a char in single quotes
        returns the index of this char. it returns number
         */
        System.out.println(str.indexOf('c'));
        int letter = str.indexOf('g');
        System.out.println(letter);

        String str2= "abcccakssslams";
        System.out.println(str2 + ": " + str2.indexOf('b'));
        int index2=str2.indexOf(' ', 5); // it is -1 because there is no space in text
        System.out.println(index2);

        str2.indexOf('c'); // if indexOf takes one char, it returns the index



        String state = "Connecticut";
        //command + D -> to copy previous code:
        System.out.println(" index of o: " +state.indexOf('o')); //1
        System.out.println("index of ti is: " + state.indexOf("ti")); //6 only the first letter of the index
        System.out.println("index of u, after 50%: " + state.indexOf('u', state.length()/2));
        System.out.println( "index of last letter: " + state.indexOf('t', state.length()-1));
        System.out.println(state.length()-1);
        System.out.println(state.indexOf("10", state.length()-1));

//        isEmpty()
//        returns boolean
//        true= empty, false= not empty
        String name1= "Hello, Codewise!";
        String name2="";
        System.out.println(name1.isEmpty());
        System.out.println(name2.isEmpty()); //space matters











    }

}
