public class Streaming {
    private String artist;
    private String song;
    private int duration;

    public Streaming(String artist, String song) {
        this.artist = artist;
        this.song = song;
        this.duration = 4;
    }


    public String getArtist() {
        return artist;
    }

    public String getSong() {
        return song;
    }

    public int getDuration() {
        return duration;
    }

    public void getString() {
        System.out.println(getSong() + " by " + getArtist() + " and continues for " + getDuration());
    }
}
