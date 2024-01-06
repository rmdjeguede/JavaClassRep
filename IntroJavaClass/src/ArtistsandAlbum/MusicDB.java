package ArtistsandAlbum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MusicDB {
    
    private static final String ArtistID = null;
    private static final String AlbumID = null;
    private static final String Name = null;
    //public static char[] getAllArtists;



    // create a connexion to the database using the Connection method
    private static Connection getConnection() throws SQLException {
        String dbUrl = ("jdbc:sqlite:C:music_artists.sqlite");
        Connection connection = DriverManager.getConnection(dbUrl);
        return connection;
    }



    // create a class that return all the element from the music_artist table
    public static ArrayList<Albums> getAllAlbums() throws SQLException {
        String sql = "SELECT AlbumID, ArtistID, Name " + " FROM Albums ORDER BY Name ASC";

        // create a variable albums from the album object.
        var albums = new ArrayList<Albums>();
        try(Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int albumID = rs.getInt(AlbumID);
                    int artistID = rs.getInt(ArtistID);
                    String name = rs.getString(Name); 

                    Albums al = new Albums(albumID, artistID, name); 
                    albums.add(al); 
                }
                rs.close();
                return albums;
            } catch (SQLException e) {
                System.err.println(e);
                return null;
            }
    }

    // create a class that connect to the database and return the Album data.

    public static ArrayList<Artists> getAllArtists() {
        String sql = "SELECT ArtistID, Name " + " FROM Artists ORDER BY Name ASC";

        // create a variable artists from the Artists object.
        var artists = new ArrayList<Artists>();
        try(Connection connection = getConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int artistID = rs.getInt(ArtistID);
                String name = rs.getString(Name);

                Artists ar = new Artists(artistID, name);
                artists.add(ar);
            }
            rs.close();
            return artists;
        } catch (SQLException e) {
            System.err.println(e);
            return null; 
        }

    }

        // create a class that return albums select by artist.
    public static ArrayList<Albums> getBeatlesAlbums() throws SQLException {
        String sql = "SELECT AlbumID, ArtistID, Name " + " FROM Albums WHERE ArtistID = 1";

        // create a variable albums from the album object.
        var beatles = new ArrayList<Albums>();
        try(Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int albumID = rs.getInt(AlbumID);
                    int artistID = rs.getInt(ArtistID);
                    String name = rs.getString(Name); 

                    Albums al = new Albums(albumID, artistID, name); 
                    beatles.add(al); 
                }
                rs.close();
                return beatles;
            } catch (SQLException e) {
                System.err.println(e);
                return null;
            }
    }

            // create a class that return albums select by artist.
    public static ArrayList<Albums> getElvisAlbums() throws SQLException {
        String sql = "SELECT AlbumID, ArtistID, Name " + " FROM Albums WHERE ArtistID = 2";

        // create a variable albums from the album object.
        var elvis = new ArrayList<Albums>();
        try(Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int albumID = rs.getInt(AlbumID);
                    int artistID = rs.getInt(ArtistID);
                    String name = rs.getString(Name); 

                    Albums al = new Albums(albumID, artistID, name); 
                    elvis.add(al); 
                }
                rs.close();
                return elvis;
            } catch (SQLException e) {
                System.err.println(e);
                return null;
            }
    }

                // create a class that return albums select by artist.
    public static ArrayList<Albums> getPrinceAlbums() throws SQLException {
        String sql = "SELECT AlbumID, ArtistID, Name " + " FROM Albums WHERE ArtistID = 3";

        // create a variable albums from the album object.
        var prince = new ArrayList<Albums>();
        try(Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int albumID = rs.getInt(AlbumID);
                    int artistID = rs.getInt(ArtistID);
                    String name = rs.getString(Name); 

                    Albums al = new Albums(albumID, artistID, name); 
                    prince.add(al); 
                }
                rs.close();
                return prince;
            } catch (SQLException e) {
                System.err.println(e);
                return null;
            }
    }

}
