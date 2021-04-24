import java.util.ArrayList;
public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(String song1, String song2, String song3, 
    String song4, String song5) {
        songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    @Override
    public String playFromBeginning() {
        currentIndex = 0;
        return playSong(currentIndex);
    }

    @Override
    public String playSong(int num) {
        if(num <= songs.size()) {
            currentIndex +=1;
            return "Playing: " +  this.currentIndex + ": " + songs.get(currentIndex-1);
        }
        else {
            return "arfg";
        }
    }

    @Override
    public String prevSong() {
        this.currentIndex -= 1;
        return "Skipping back and playing: " + songs.get(currentIndex-1);
    }

    @Override
    public String nextSong() {
        return playSong(currentIndex);
    }

    @Override
    public String stop() {
        return null;
    }

    @Override
    public String pause() {
        
        return null;
    }
    
}
