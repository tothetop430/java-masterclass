package learning;

import learning.model.Artist;
import learning.model.DataSource;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        if (!dataSource.openConnection()) {
            System.out.println("Failed to Open DataSource Connection!");
            return;
        }

        List<Artist> artistList = dataSource.queryArtists(DataSource.ORDER_BY_DESC);

        if(artistList == null) {
            System.out.println("Couldn't retrieve the artists");
            dataSource.closeConnection();
            return;
        }

        for (Artist artist : artistList) {
            System.out.println("Artist ID: " + artist.getId() + ", Name: " + artist.getName());
        }

        dataSource.closeConnection();
    }
}
