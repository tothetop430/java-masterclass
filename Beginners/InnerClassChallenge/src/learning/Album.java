package learning;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private SongList songs;
    private String name, artist;

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public Song findSong(String songName) {
            for (Song song : songs) {
                if (song.getTitle().equals(songName)) {
                    return song;
                }
            }
            return null;
        }

        public boolean addSong(Song song) {
            if (findSong(song.getTitle()) == null) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        public int getSize() {
            return this.songs.size();
        }

        public Song getSong(int number) {
            return this.songs.get(number);
        }

    }

    public Album(String name, String artist) {
        this.songs = new SongList();
        this.name = name;
        this.artist = artist;
    }

    public boolean addSong(String songName, double songDuration) {
        Song song = new Song(songName, songDuration);
        return this.songs.addSong(song);
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber<=0 || songs.getSize()<trackNumber) return false;
        Song song = songs.getSong(trackNumber-1);
        playlist.add(song);
        return true;
    }

    public boolean addToPlayList(String songName, LinkedList<Song> playlist) {
        Song song = this.songs.findSong(songName);
        if (song == null) {
            return false;
        }
        playlist.add(song);
        return true;
    }
}
