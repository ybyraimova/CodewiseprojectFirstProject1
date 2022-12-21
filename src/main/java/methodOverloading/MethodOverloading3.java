package methodOverloading;

public class MethodOverloading3 {
    /* create a method which will find if the word is palindrome:
    which takes 1 string, if the word is palindrome return true; else false;
    civic = civic
    mom= mom
     */
    public static void main(String[] args) {
        isPalindrome("mom");
        isPalindrome("far");
        String [] str1 = {"civic", "mom", "madam", "lol"};
        String [] str2 = {"father", "mom", "lol"};
        System.out.println();
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));


    }

    public static boolean isPalindrome(String str){
        String reversed = "";
        for(int i = str.length()-1; i>=0; i--){
            reversed+=str.charAt(i); //concatenation of chars in string
        }
        System.out.println(reversed.equals(str));
        return reversed.equals(str);
    }

    public static boolean isPalindrome(String str1, String str2){
        return str1.equals(str2);
    }

    public static  boolean isPalindrome(String [] arr){
        for(int i =0; i<arr.length; i++){
            if(!isPalindrome(arr[i])){
                return false;
            }
        }
        System.out.println(true);
        return true;
    }
}
