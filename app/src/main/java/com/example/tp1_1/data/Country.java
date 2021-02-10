package com.example.tp1_1.data;

public class Country {

    private String name;
    private String capital;
    private String imgFile;
    private String language;
    private String currency;
    private int population;
    private int area;

    public Country(String name, String capital, String imgFile, String language, String currency, int population, int area) {
        this.name = name;
        this.capital = capital;
        this.imgFile = imgFile;
        this.language = language;
        this.currency = currency;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String capital) {
        this.name = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getImgUri() {
        return "@drawable/ic_"+imgFile+"_320px";
    }

    public void setImgFile(String imgFile) {
        this.imgFile = imgFile;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }


    public static Country[] countries = {new Country("France", "Paris", "flag_of_france", "français", "euro", 67348000, 640679),
            new Country("Allemagne", "Berlin", "flag_of_germany", "allemand", "euro", 82887000, 357340),
            new Country("Espagne", "Madrid", "flag_of_spain", "espagnol", "euro", 48958159, 505911),
            new Country("Afrique du Sud", "Pretoria", "flag_of_south_africa", "anglais, afrikaans et 9 langues bantoues", "rand", 55653654, 1219912),
            new Country("États-Unis", "Washington", "flag_of_the_united_states", "aucune", "dollar américain", 327167434, 9833517),
            new Country("Japon", "Tokyo", "flag_of_japan", "japonais", "yen", 126168156, 377915),
            new Country("Chine", "Pékin", "flag_of_china", "Mandarin standard", "yuan ou renminbi", 1394015977, 9596960),
            new Country("Inde", "New Dehli", "flag_of_india", "Hindi, anglais, et 22 langues regionales", "roupie Indienne", 1326093247, 3287263),
            new Country("Brésil", "Brasilia", "flag_of_brasil", "Portugais", "Réal brésilien", 211715973, 8515876),
    };
}
