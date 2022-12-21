package Scanner;

public class Platform {
    public static void main(String[] args) {
        YoutubeVideo video = new YoutubeVideo();
        System.out.println(video.views);
        video.watch();
        video.watch();
        video.watch();
        video.likes();
        video.comment("Great!");
        video.comment("LOL");
        System.out.println(video.comments);
        System.out.println(video.views);
        System.out.println(video.likes);
        video.makePrivate();
        System.out.println(video.isPrivate);
    }

}
