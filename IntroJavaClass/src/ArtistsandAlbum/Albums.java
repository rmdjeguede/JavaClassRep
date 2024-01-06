package ArtistsandAlbum;

public class Albums {

    // intanciate the variable.
    private int AlbumID;
    private int ArtistID; 
    private String Name;

    // the class constructor.
    public Albums(int AlbumID, int ArtistID,  String Name) {
        AlbumID = 0;
        ArtistID = 0;
        Name = "";
    }

    // set and get method for the AlbumID variable
    public void setAlbumID (int AlbumID) {
        this.AlbumID = AlbumID;
    }

    public int getAlbumID() {
        return AlbumID;
    }

    // set and get method for the ArtistId variable.
    public void setArtistID (int ArtistID) {
        this.ArtistID = ArtistID;
    }

    public int getArtistID() {
        return ArtistID;
    }

    // the set and get method for the name variable.
    public void setName (String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
    
}
