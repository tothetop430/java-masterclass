package learning;

import learning.model.Artist;
import learning.model.ArtistForSong;
import learning.model.DataSource;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        if (!dataSource.openConnection()) {
            System.out.println("Failed to Open DataSource Connection!");
            return;
        }

        List<Artist> artistList = dataSource.queryArtists(DataSource.ORDER_BY_NONE);

        if(artistList == null) {
            System.out.println("Couldn't retrieve the artists");
            dataSource.closeConnection();
            return;
        }

        for (Artist artist : artistList) {
            System.out.println("Artist ID: " + artist.getId() + ", Name: " + artist.getName());
        }

        System.out.println("=== Album By Artist ===");

        List<String> albums = dataSource.queryAlbumForArtist("Iron Maiden", DataSource.ORDER_BY_DESC);
        if(albums == null) {
            System.out.println("Couldn't retrieve the albums");
            dataSource.closeConnection();
            return;
        }
        for (String album : albums) {
            System.out.println("Album: " + album);
        }

        System.out.println("=== Artist By Song ===");

        List<ArtistForSong> artistForSongList = dataSource.queryArtistForSong("Go Your Own Way",
                DataSource.ORDER_BY_DESC);
        if (artistForSongList == null) {
            System.out.println("Couldn't retrieve the artists");
            dataSource.closeConnection();
            return;
        }
        for (ArtistForSong artist : artistForSongList) {
            System.out.println("Song Name: " + artist.getTitleTrack() + ", Album: " + artist.getAlbumName() +
                    ", Artist: " + artist.getArtistName());
        }


        System.out.println("=== SONGS TABLE META DATA ===");
        dataSource.queryMetaData(DataSource.TABLE_SONGS);

        System.out.println("=== Row Count ===");
        System.out.println(dataSource.getRowCount(DataSource.TABLE_ARTISTS));
        System.out.println(dataSource.getRowCount(DataSource.TABLE_SONGS));
        System.out.println(dataSource.getRowCount(DataSource.TABLE_ALBUMS));

        System.out.println("=== CREATE VIEW ===");
        dataSource.createViewArtistForSong();

        System.out.println("=== QUERYING VIEW ===");
        List<ArtistForSong> viewArtistForSongList = dataSource.queryViewArtistForSong();
        if (viewArtistForSongList == null) {
            System.out.println("Couldn't retrieve the artists");
            dataSource.closeConnection();
            return;
        }
        for (ArtistForSong artist : viewArtistForSongList) {
            System.out.println("Song Name: " + artist.getTitleTrack() + ", Album: " + artist.getAlbumName() +
                    ", Artist: " + artist.getArtistName());
        }

        System.out.println("=== INPUT SQL INJECTION ===");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Song Name: ");
        List<ArtistForSong> artistForSongList2 = dataSource.queryArtistForSong(scanner.nextLine(),
                DataSource.ORDER_BY_DESC);
        if (artistForSongList2 == null) {
            System.out.println("Couldn't retrieve the artists");
            dataSource.closeConnection();
            return;
        }
        for (ArtistForSong artist : artistForSongList2) {
            System.out.println("Song Name: " + artist.getTitleTrack() + ", Album: " + artist.getAlbumName() +
                    ", Artist: " + artist.getArtistName());
        }

        dataSource.closeConnection();
    }
}
