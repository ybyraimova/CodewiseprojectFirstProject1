package stringManipulation;

public class Contains {
    public static void main(String[] args) {
        /*
        .contains() method comes from Sting class, and can only be used by String.
        it checks if one string contains another string
        returns boolean:false or true
         */
        String slogan= "Chicago is a windy city";
        String city= "Chicago";
        boolean doesitContain= slogan.contains(city);
        System.out.println(doesitContain);
        doesitContain =slogan.contains("windy");
        doesitContain = slogan.contains("win"); //true
        doesitContain = slogan.contains("s a"); //true
        doesitContain= slogan.contains("ChicagO"); //false because case sensitive
        doesitContain = slogan.contains("Chicago is a windy ci"); //true because the sequence is correct;
        doesitContain = slogan.contains("Chicago is windy city"); //false because ghe sequence is not correct;

        String company = "GOOGLe";
        String website = "google";
        boolean b= company.contains(website); //false

        b= company.contains(website.toUpperCase());
        b= company.toLowerCase().contains(website);








    }
}
