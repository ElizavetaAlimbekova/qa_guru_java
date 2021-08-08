package guru.qa;


public class Main {
    public static void main (String[] args) {
        Country one = new Country ("Sweden", 10151466, false);
        Country two = new Country ("Norway", 5537764, true);

        one.printInfoCountry ();
        two.printInfoCountry ();

    }
}
