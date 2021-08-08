package guru.qa;

public class Country {
    String name;
    int population;
    boolean languageEnglish;


    public Country (String name, int population, boolean languageEnglish) {
        this.name = name;
        this.population = population;
        this.languageEnglish = languageEnglish;

    }


    void printInfoCountry () {
        System.out.println ("Country: " + name + " , Population: " + population + " ,Poverty rate:" + ", Speak English this country: " + languageEnglish);
    }

}

