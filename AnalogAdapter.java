public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;
    private int num = 0;

    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }
    @Override
    public String play() {
        return album.playSong(num);
    }

    @Override
    public String rewind() {
        return album.prevSong();
    }

    @Override
    public String ffwd() {
        return album.nextSong();
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
