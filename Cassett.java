import java.util.ArrayList;
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

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
        currentIndex +=1;
        return "Playing song " + (this.currentIndex) + ": " + songs.get(this.currentIndex - 1);
    }

    @Override
    public String rewind() {
        currentIndex-= 1;
        return "Rewinding to song " + (currentIndex+1);
    }

    @Override
    public String ffwd() {
        currentIndex +=1;
        return "Forward to song " + (currentIndex+1);
    }

    @Override
    public String pause() {
        return "Pausing...";
    }

    @Override
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
    
}
