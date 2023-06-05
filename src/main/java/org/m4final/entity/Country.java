package org.m4final.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(schema = "world", name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    @Column(name = "code_2")
    private String code2;

    private String name;

    @Column(name = "continent")
    @Enumerated(EnumType.ORDINAL)
    private Continent continent;

    private String region;

    @Column(name = "surface_area")
    private BigDecimal surfaceArea;

    @Column(name = "indep_year")
    private Short independenceYear;

    private Integer population;

    @Column(name = "life_expectancy")
    private BigDecimal lifeExpectancy;

    @Column(name = "gnp")
    private BigDecimal GNP;

    @Column(name = "gnpo_id")
    private BigDecimal GNPOId;

    @Column(name = "local_name")
    private String localName;

    @Column(name = "government_form")
    private String governmentForm;

    @Column(name = "head_of_state")
    private String headOfState;

    @OneToOne
    @JoinColumn(name = "capital")
    private City city;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Set<CountryLanguage> languages;


    public Integer getId() {
        return id;
    }

    public Country setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Country setCode(String code) {
        this.code = code;
        return this;
    }

    public String getCode2() {
        return code2;
    }

    public Country setCode2(String code2) {
        this.code2 = code2;
        return this;
    }

    public String getName() {
        return name;
    }

    public Country setName(String name) {
        this.name = name;
        return this;
    }

    public Continent getContinent() {
        return continent;
    }

    public Country setContinent(Continent continent) {
        this.continent = continent;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public Country setRegion(String region) {
        this.region = region;
        return this;
    }

    public BigDecimal getSurfaceArea() {
        return surfaceArea;
    }

    public Country setSurfaceArea(BigDecimal surfaceArea) {
        this.surfaceArea = surfaceArea;
        return this;
    }

    public Short getIndependenceYear() {
        return independenceYear;
    }

    public Country setIndependenceYear(Short independenceYear) {
        this.independenceYear = independenceYear;
        return this;
    }

    public Integer getPopulation() {
        return population;
    }

    public Country setPopulation(Integer population) {
        this.population = population;
        return this;
    }

    public BigDecimal getLifeExpectancy() {
        return lifeExpectancy;
    }

    public Country setLifeExpectancy(BigDecimal lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
        return this;
    }

    public BigDecimal getGNP() {
        return GNP;
    }

    public Country setGNP(BigDecimal GNP) {
        this.GNP = GNP;
        return this;
    }

    public BigDecimal getGNPOId() {
        return GNPOId;
    }

    public Country setGNPOId(BigDecimal GNPOId) {
        this.GNPOId = GNPOId;
        return this;
    }

    public String getLocalName() {
        return localName;
    }

    public Country setLocalName(String localName) {
        this.localName = localName;
        return this;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public Country setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
        return this;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public Country setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
        return this;
    }

    public City getCity() {
        return city;
    }

    public Country setCity(City city) {
        this.city = city;
        return this;
    }

    public Set<CountryLanguage> getLanguages() {
        return languages;
    }

    public Country setLanguages(Set<CountryLanguage> languages) {
        this.languages = languages;
        return this;
    }
}
