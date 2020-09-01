package adapterPattern;

public class Demo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp4","Mp4 content");
        audioPlayer.play("vlc","Vlc content");
        audioPlayer.play("mp3","Mp3 content");
        audioPlayer.play("vav","Vav content");
    }
}
