import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> songs;

    public Playlist(ArrayList<String> songs) {
        this.songs = songs;
    }

    public void addSong(String name) {
        this.songs.add(name);
    }

    public void removeSong(String name) {
        this.songs.remove(name);
    }

    public void printSongs() {
        for(String song : this.songs) {
            System.out.println(song);
        }
    }
}
