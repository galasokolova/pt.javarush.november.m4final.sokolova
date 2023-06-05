package org.m4final.redis;

import org.m4final.entity.Continent;

import java.math.BigDecimal;
import java.util.Set;

public class CityCountry {
    private Integer id;

    private String name;

    private String district;

    private Integer population;

    private String countryCode;

    private String alternativeCountryCode;

    private String countryName;

    private Continent continent;

    private String countryRegion;

    private BigDecimal countrySurfaceArea;

    private Integer countryPopulation;

    private Set<Language> languages;


    public Integer getId() {
        return id;
    }

    public CityCountry setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CityCountry setName(String name) {
        this.name = name;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public CityCountry setDistrict(String district) {
        this.district = district;
        return this;
    }

    public Integer getPopulation() {
        return population;
    }

    public CityCountry setPopulation(Integer population) {
        this.population = population;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public CityCountry setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getAlternativeCountryCode() {
        return alternativeCountryCode;
    }

    public CityCountry setAlternativeCountryCode(String alternativeCountryCode) {
        this.alternativeCountryCode = alternativeCountryCode;
        return this;
    }

    public String getCountryName() {
        return countryName;
    }

    public CityCountry setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public Continent getContinent() {
        return continent;
    }

    public CityCountry setContinent(Continent continent) {
        this.continent = continent;
        return this;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public CityCountry setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
        return this;
    }

    public BigDecimal getCountrySurfaceArea() {
        return countrySurfaceArea;
    }

    public CityCountry setCountrySurfaceArea(BigDecimal countrySurfaceArea) {
        this.countrySurfaceArea = countrySurfaceArea;
        return this;
    }

    public Integer getCountryPopulation() {
        return countryPopulation;
    }

    public CityCountry setCountryPopulation(Integer countryPopulation) {
        this.countryPopulation = countryPopulation;
        return this;
    }

    public Set<Language> getLanguages() {
        return languages;
    }

    public CityCountry setLanguages(Set<Language> languages) {
        this.languages = languages;
        return this;
    }
}