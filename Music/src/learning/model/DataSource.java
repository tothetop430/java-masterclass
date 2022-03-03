package learning.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    private Connection connection;
    private final String DB_NAME = "music.db";
    private final String connectionString = "jdbc:sqlite:" +
            "/Users/siddharth/Documents/Projects/java-masterclass/Music/" +
            DB_NAME;

    public final String TABLE_ALBUMS = "albums";
    public final String TABLE_ARTISTS = "artists";
    public final String TABLE_SONGS = "songs";

    public final String COL_ALBUM_ID = "_id";
    public final String COL_ALBUM_NAME = "name";
    public final String COL_ALBUM_ARTIST = "artist";

    public final String COL_ARTIST_ID = "_id";
    public final String COL_ARTIST_NAME = "name";

    public final String COL_SONG_ID = "_id";
    public final String COL_SONG_TRACK = "track";
    public final String COL_SONG_TITLE = "title";
    public final String COL_SONG_ALBUM = "album";

    public static final int ORDER_BY_NONE = 0;
    public static final int ORDER_BY_ASC = 1;
    public static final int ORDER_BY_DESC = 2;

    public boolean openConnection() {
        try {
            this.connection = DriverManager.getConnection(connectionString);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public void closeConnection() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Artist> queryArtists(int orderby) {
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM ");
        stringBuilder.append(TABLE_ARTISTS);
        if (orderby != ORDER_BY_NONE) {
            stringBuilder.append(" ORDER BY " + COL_ARTIST_ID);
            stringBuilder.append(orderby == ORDER_BY_DESC ? "  DESC" : " ASC");
        }
        try (Statement statement = this.connection.createStatement();
             ResultSet results = statement.executeQuery(stringBuilder.toString())) {
            List<Artist> artists = new ArrayList<>();
            while (results.next()) {
                Artist artist = new Artist();
                artist.setId(results.getInt(COL_ARTIST_ID));
                artist.setName(results.getString(COL_ARTIST_NAME));
                artists.add(artist);
            }
            return artists;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<String> queryAlbumForArtist(String artist, int orderBy) {
        String query = "SELECT albums.name FROM albums INNER JOIN artists ON albums.artist = artists._id " +
                "WHERE artists.name = '" + artist + "' " +
                "ORDER BY albums.name";
        StringBuilder sB = new StringBuilder(query);
        if (orderBy != ORDER_BY_NONE) sB.append(orderBy == ORDER_BY_DESC ? " DESC" : " ASC");
        List<String> albums = new ArrayList<>();
        try (Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sB.toString())) {
            while(resultSet.next()) {
                albums.add(resultSet.getString(1));
            }
            return albums;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ArtistForSong> queryArtistForSong(String songName, int orderBy) {
        String query = "SELECT songs.title AS \"Song Title\", albums.name AS \"Album Name\", artists.name AS \"Artist Name\" " +
                "FROM songs INNER JOIN albums ON songs.album = albums._id " +
                "INNER JOIN artists ON artists._id = albums.artist " +
                "WHERE songs.title = '" + songName + "' " +
                "ORDER BY songs.title";
        StringBuilder sB = new StringBuilder(query);
        if (orderBy != ORDER_BY_NONE) sB.append(orderBy == ORDER_BY_DESC ? " DESC" : " ASC");
        List<ArtistForSong> artistForSongList = new ArrayList<>();
        try (Statement statement = this.connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sB.toString())) {
            while(resultSet.next()) {
                ArtistForSong artistForSong = new ArtistForSong();
                artistForSong.setTitleTrack(resultSet.getString(1));
                artistForSong.setAlbumName(resultSet.getString(2));
                artistForSong.setArtistName(resultSet.getString(3));
                artistForSongList.add(artistForSong);
            }
            return artistForSongList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
