package guru.qa;

public class Country {

    static String regionTheseCountries = "Scandinavia";

    String name;
    int population;
    boolean languageEnglish=true;

    public Country(String name, int population, boolean languageEnglish) {
        this.name = name;
        this.population = population;
        this.languageEnglish = languageEnglish;
    }


    String isName(){                              //возвращающий метод

        return name;
    }



    void setPopulation(int population){
        this.population = population;             //this это ссылка на обьект

    }

    static void region(){                         // статический метод
        System.out.println(regionTheseCountries);
    }

}
