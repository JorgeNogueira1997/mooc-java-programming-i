
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object x) {
        // (1) check if the 2 objects are in the same
        // memory location/ same address
        if (this == x) {
            return true;
        }

        // (2) if the "x" isn't iven of type Song, exit
        if (!(x instanceof Song)) {
            return false;
        }

        // (3) cast the "x" to the type of the class
        Song aux = (Song) x;

        // (4) check if every contents are the same
        // if so, return true
        if (this.artist.equals(aux.artist)
                && this.name.equals(aux.name)
                && this.durationInSeconds == aux.durationInSeconds) {
            return true;
        }

        // if any of those above doesn't do anyhting
        // returns false, the objecst are not the same
        return false;

    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
