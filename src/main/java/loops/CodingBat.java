package loops;

public class CodingBat {
    public static void main(String[] args) {
        String str = null;
        String str1 = str;

        System.out.println(catDog("jfbvijdkmvcatdog"));
        System.out.println(endOther("hileodj", "dhjckliuythello"));
        System.out.println(xyzThere("skjdhei.xyz"));
        System.out.println(xyzThere("skjdheixyz.lkjh"));
    }

    public static boolean catDog(String str) {
        int dog = 0;
        int cat = 0;
        for(int i= 0; i < str.length()-2; i++){
            if(str.substring(i, i+3).equals("cat")){
                cat++;
            }else if(str.substring(i, i+3).equals("dog")){
                dog++;
            }

        }
        return cat == dog;
    }

    public static int countCode(String str){
        int counter =0;
        for (int i = 0; i <= str.length()-4; i++){
            String fourLetter = str.substring(i, i+4);
            if(fourLetter.substring(0,2).equals("co") && fourLetter.charAt(3)=='e'){
                counter++;
            }

        }
        return counter;
    }

    public static boolean endOther(String a, String b){
        if(a.toLowerCase().endsWith(b.toLowerCase())){
            return true;
        }else if(b.toLowerCase().endsWith(a.toLowerCase())){
            return true;
        }
        return false;
    }

    public static boolean xyzThere(String str){
        if(str.contains(".xyz")){
            return false;
        }else if(str.contains("xyz")){
        }
        return true;

    }


//    Return true if the given string contains an appearance of "xyz" where
//    the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
//    xyzThere("abcxyz") → true
//    xyzThere("abc.xyz") → false
//    xyzThere("xyz.abc") → true


        }


