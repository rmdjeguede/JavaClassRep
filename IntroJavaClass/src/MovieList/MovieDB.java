package MovieList;
import java.util.ArrayList;
public class MovieDB {

    public static void getdrama() {
        // Create a drama Arraylist to drama movies.
        ArrayList<String> drama = new ArrayList<>();
        drama.add("The Godfather");
        drama.add("Casablanca");
        drama.add("The Graduate");
        drama.add("Lawrence Of Arabia");
        drama.add("Gone With The Wind");
        System.out.println(drama);
        System.out.println();
    }
    public static void getmusical() {
            // create musical Arraylist
        ArrayList<String> musical = new ArrayList<>();
        musical.add("The Wizard Of Oz");
        musical.add("Singing' In The Rain");
        musical.add("West Side Story");
        musical.add("The Sound Of Music");
        musical.add("My Fair Lady");
        System.out.println(musical);
        System.out.println();
    }
    public static void gethorror() {
         // create an horror Arraylist with horror movies title.
        ArrayList<String> horror = new ArrayList<>();
        horror.add("Psycho");
        horror.add("King Kong");
        horror.add("Jaws");
        horror.add("The Silence Of The Lambs");
        horror.add("Frankenstein");
        System.out.println(horror);
        System.out.println();
    }
    public static void getscifi() {
        // create an scifi Arraylist
        ArrayList<String> scifi = new ArrayList<>();
        scifi.add("Star Wars");
        scifi.add("2001: A Space Odyssey");
        scifi.add("E.T. The extra-terrestrial");
        scifi.add("A Clockwork Orange");
        scifi.add("Close Encounters Of The Third Kind");
        System.out.println(scifi);
        System.out.println();
    }
    public static void getanimated() {
        // create an animated Arraylist.
        ArrayList<String> animated = new ArrayList<>();
        animated.add("Snow White And The Seven Dwarfs");
        animated.add("Fantasia");
        animated.add("Mavka");
        animated.add("Peter Pan & Wendy");
        animated.add("Spider Man");
        System.out.println(animated);
        System.out.println();
    }
static void getcomedy() {
        // create an comedy Arraylist.
        ArrayList<String> comedy = new ArrayList<>();
        comedy.add("Annie Hall");
        comedy.add("M*A*S*H");
        comedy.add("Tootsie");
        comedy.add("Duck Soup");
        comedy.add("Old Dads");
        System.out.println(comedy);
        System.out.println();
    }
}
