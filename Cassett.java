import java.util.ArrayList;
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentindex;

    public Cassett(String song1, String song2, String song3, 
    String song4, String song5) {
        songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    @Override
    public String play() {
        return null;
    }

    @Override
    public String rewind() {
        return null;
    }

    @Override
    public String ffwd() {
        return null;
    }

    @Override
    public String pause() {
        return null;
    }

    @Override
    public String stopEject() {
        return null;
    }
    
}
