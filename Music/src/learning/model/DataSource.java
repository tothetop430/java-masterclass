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

    public List<Artist> queryArtists() {
        try (Statement statement = this.connection.createStatement();
             ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS)) {
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

}
