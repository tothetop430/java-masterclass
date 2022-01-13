package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private ArrayList<Song> songs;
    private String name, artist;

    public Album(String name, String artist) {
        this.songs = new ArrayList<>();
        this.name = name;
        this.artist = artist;
    }

    private Song findSong(String songName) {
        for (Song song : songs) {
            if (song.getTitle().equals(songName)) {
                return song;
            }
        }
        return null;
    }

    public boolean addSong(String songName, double songDuration) {
        Song song = new Song(songName, songDuration);
        if (findSong(song.getTitle()) == null) {
            songs.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber<=0 || songs.size()<trackNumber) return false;
        Song song = songs.get(trackNumber-1);
        playlist.add(song);
        return true;
    }

    public boolean addToPlayList(String songName, LinkedList<Song> playlist) {
        Song song = findSong(songName);
        if (song == null) {
            return false;
        }
        playlist.add(song);
        return true;
    }
}
