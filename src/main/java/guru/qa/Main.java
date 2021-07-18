package guru.qa;

import static guru.qa.Country.region;
import static guru.qa.Country.regionTheseCountries;

public class Main {
    public static void main(String[] args){
        Country one = new Country("Sweden",10151466, false );
        Country two = new Country("Norway",5537764,true );




        one.setPopulation(10151466);
        two.setPopulation(5537764);


        region();


        System.out.println(one.isName() + - one.population);

    }
}
