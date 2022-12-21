package classesAndObjects;

public class User {
    String username;
    String password;
    String email;
    String dob;
    String gender;
    int phoneNumber;
    boolean isPrivate;
    int numOfFollowers;
    String lastMessage;
    /*
    How to create login method:

    public is access modifier - means we are telling that this method can be used by everyone.
    static means that all the  classes  can use the method in one package/folder.
    username, password =parameters
     */
    public static void login(String username, String password){
        System.out.println(username + " logged in using password: " +password);
    }

    public int getNumOfFollowers(String username){
        return numOfFollowers;
    }

    public String getLastMessage(String username){
        return lastMessage;
    }

    public boolean isPrivate(String username){
        return isPrivate;
    }

    public String todaysDate(){
        return "11/30/2022";
    }

//    public void likePost(String username);
//    when void you cannot back data/cannot return


    /* create 10 empty methods
    void
    string
    byte
    short
    int
    long
    double
    float
    char
    boolean

     */


}
