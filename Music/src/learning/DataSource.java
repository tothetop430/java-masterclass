package learning;

import java.sql.Connection;

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

    public final String COL_ARTISTS_ID = "_id";
    public final String COL_ARTISTS_NAME = "name";

    public final String COL_SONGS_ID = "_id";
    public final String COL_SONGS_TRACK = "track";
    public final String COL_SONGS_TITLE = "title";
    public final String COL_SONGS_ALBUM = "album";

}
