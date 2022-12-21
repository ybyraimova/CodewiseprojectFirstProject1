package Scanner;

public class YoutubeVideo {

//    instance variables:
    String title;
    double length;
    boolean isforKids;
    long views;
    int year;
    String comments;
    int likes;
    boolean isPrivate;




//    Create method called watch and increment view varaible:

//    1. Method signature void method, watch name, method parameters -> no parameters
//    2. add 1 to current views

    public void watch(){
        if(isPrivate){
            System.out.println("sorry, the video is private");
        }else{
            System.out.println("enjoy the video");
        }
    views++; //views = views+1;
}
    public void likes(){
        likes++;
    }

    public void comment(String newComment){
        comments += "\n" +newComment;
    }

    public void makePrivate(){

        isPrivate = true;
    }
}


