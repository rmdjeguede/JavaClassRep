package ArtistsandAlbum;

import java.sql.SQLException;
import java.util.ArrayList;

public class MusicApp {

    //private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        System.out.println("Artist and Album Listing");
        System.out.println();

        // get the Artist object.
        ArrayList<Artists> artists = MusicDB.getAllArtists();

        // display the list of all the artists in the database.
        System.out.println("Artists");
        System.out.println("--------");
        System.out.println(artists);

        // get the albums object.
        ArrayList <Albums> albums = MusicDB.getAllAlbums();

        // display to the console the list of all the album in the database
        System.out.println();
        System.out.println("Albums");
        System.out.println("--------");
        System.out.println(albums);

        // create an arraylist to hold the albums produce by each artist or group.
        ArrayList<Albums> elvis = MusicDB.getElvisAlbums();
        ArrayList<Albums> beatles = MusicDB.getBeatlesAlbums();
        ArrayList<Albums>prince = MusicDB.getPrinceAlbums();

        // display the albums range by artists.
        System.out.println();
        System.out.println("Albums by Artist");
        System.out.println("-------------------");


        
        System.out.println("Elvis Presley:");
        System.out.println(elvis);

        System.out.println("The Beatles:");
        System.out.println(beatles);


        
        System.out.println("John Prince:");
        System.out.println(prince);
    }
    
}
