import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcom to testing the switch app");

        // Create a drama Arraylist to drama movies.
        ArrayList<String> drama = new ArrayList<>();
        drama.add("The Godfather");
        drama.add("Casablanca");
        drama.add("The Graduate");
        drama.add("Lawrence Of Arabia");
        drama.add("Gone With The Wind");

        // create musical Arraylist
        var musical = new ArrayList<>();
        musical.add("The Wizard Of Oz");
        musical.add("Singing' In The Rain");
        musical.add("West Side Story");
        musical.add("The Sound Of Music");
        musical.add("My Fair Lady");

        // create an horror Arraylist with horror movies title.
        var horror = new ArrayList<>();
        horror.add("Psycho");
        horror.add("King Kong");
        horror.add("Jaws");
        horror.add("The Silence Of The Lambs");
        horror.add("Frankenstein");

        // create an scifi Arraylist
        var scifi = new ArrayList<>();
        scifi.add("Star Wars");
        scifi.add("2001: A Space Odyssey");
        scifi.add("E.T. The extra-terrestrial");
        scifi.add("A Clockwork Orange");
        scifi.add("Close Encounters Of The Third Kind");

        // create an animated Arraylist.
        var animated = new ArrayList<>();
        animated.add("Snow White And The Seven Dwarfs");
        animated.add("Fantasia");
        animated.add("Mavka");
        animated.add("Peter Pan & Wendy");
        animated.add("Spider Man");

        // create an comedy Arraylist.
        var comedy = new ArrayList<>();
        comedy.add("Annie Hall");
        comedy.add("M*A*S*H");
        comedy.add("Tootsie");
        comedy.add("Duck Soup");
        comedy.add("Old Dads");

    
    }
}

