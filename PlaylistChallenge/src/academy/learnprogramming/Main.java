package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        startPlaylist(playList);
    }

    private static boolean startPlaylist(LinkedList<Song> playlist) {
        ListIterator<Song> i = playlist.listIterator();
        System.out.println("Starting Playlist...");
        if(playlist.isEmpty()) {
            System.out.println("Playlist is Empty... Quitting");
            return false;
        }
        else {
            System.out.println("Playing First Song on Playlist -> " + playlist.getFirst().getTitle());
            i.next();
        }
        Scanner scanner = new Scanner(System.in);
        boolean fwd = true;
        boolean quit = false;
        printMenu();
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 0) {
                System.out.println("Stopping Playlist");
                quit = true;
            }
            else if (choice == 1) {
                if(!fwd) {
                    i.next();
                    fwd = true;
                }
                if (i.hasNext()) {
                    System.out.println("Playing Next Song -> " + i.next().getTitle());
                } else {
                    System.out.println("No Next Song... Quitting");
                    quit = true;
                }
            }
            else if (choice == 2) {
                if(fwd) {
                    i.previous();
                    fwd = false;
                }
                if (i.hasPrevious()) {
                    System.out.println("Playing Previous Song -> " + i.previous().getTitle());
                } else {
                    System.out.println("No Previous Song... Quitting");
                    quit = true;
                }
            }
            else if (choice == 3) {
                if (fwd) {
                    i.previous();
                    if (i.hasNext()) {
                        System.out.println("Replaying the current song -> " + i.next().getTitle());
                    } else {
                        System.out.println("Couldn't replay the song...Quitting");
                        quit = true;
                    }
                }
                else {
                    i.next();
                    if (i.hasPrevious()) {
                        System.out.println("Replaying the current song -> " + i.previous().getTitle());
                    } else {
                        System.out.println("Couldn't replay the song...Quitting");
                        quit = true;
                    }
                }
            }
            else if (choice == 4) {
                printPlaylist(playlist);
            }
            else if (choice == 5) {
                i.remove();
                printMenu();
            }
        }
        return true;
    }

    private static void printPlaylist(LinkedList<Song> playlist) {
        ListIterator<Song> i = playlist.listIterator();
        int count = 1;
        while(i.hasNext()) {
            System.out.println("Song [" + count + "]" + " -> " + i.next().getTitle());
            count++;
        }
    }

    private static void printMenu() {
        System.out.println("Choose From Below Options\n" +
                "0 - To Quit\n" +
                "1 - Skip FWD to Next Song\n" +
                "2 - Skip BWD to Previous Song\n" +
                "3 - Replay the Current Song\n" +
                "4 - Show All the Songs in Playlist\n" +
                "5 - Remove a Song From Playlist");
    }
}
