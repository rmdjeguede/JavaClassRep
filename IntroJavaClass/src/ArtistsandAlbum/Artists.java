package ArtistsandAlbum;

public class Artists {

    // instance of the class
    private int ArtistID;
    private String Name;
    
    // constructor of the class Artists.
    public Artists(int ArtistID, String Name) {
        ArtistID = 0;
        Name = " ";
    }

    // set and get method for the ArtistID variable.
    public void setArtistID (int ArtistID) {
        this.ArtistID = ArtistID;
    }

    public int getArtistID() {
        return ArtistID;
    }

    // set and get method for the name variable.
    public void setName (String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
}
