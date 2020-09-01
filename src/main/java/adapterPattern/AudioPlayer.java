package adapterPattern;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String fileName) {
        if (type.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name :" + fileName);
        } else if (type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type,fileName);
        }else{
            System.out.println("Invalid Data."  + type + "format not supported");
        }
    }
}
