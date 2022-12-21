package stringManipulation;

public class Substring {
    public static void main(String[] args) {
        String classes = "Java and soft skills classes";
        System.out.println(classes.substring(0,4)); //java
//        substring() takes two integers, and returns a string from index 1 up to index 2
//        beginning index =inclusive;
//        end index= exclusive;
        System.out.println(classes.substring(9,20)); // soft skills
        String soft="soft skills";

        String  result = (classes.substring(classes.indexOf("soft"),
                classes.indexOf(soft) + soft.length()));

        int beginIndex = classes.indexOf(soft);






        String sentence = "Johny Depp is the best actor in the world";
        String name = "Johny Depp";
        String newName= sentence.substring(sentence.indexOf(name), sentence.indexOf(name)+name.length());
        System.out.println(newName);

//      substrin()
String laptop = "Macbook Pro 2023 is really cool one. ";
laptop = laptop.substring(12);
        System.out.println(laptop);


        String mobilePhone = "Iphone 14 pro max is the most expensive";
        mobilePhone=mobilePhone.substring(1);
        System.out.println(mobilePhone);









    }
}
