import java.util.ArrayList;

/**
 * Created by dev on 30/04/2023
 */

public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist(new ArrayList<>());
        myPlaylist.addSong("Locked out of the Heaven");
        myPlaylist.addSong("Sweet Dreams");
        myPlaylist.addSong("Let her go");
        myPlaylist.printSongs();
        myPlaylist.removeSong("Let her go");
        myPlaylist.printSongs();
    }
}