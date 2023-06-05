package org.m4final.entity;

import jakarta.persistence.*;

@Entity
@Table(schema = "world", name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String district;

    private Integer population;

    public Integer getId() {
        return id;
    }

    public City setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public City setName(String name) {
        this.name = name;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public City setCountry(Country country) {
        this.country = country;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public City setDistrict(String district) {
        this.district = district;
        return this;
    }

    public Integer getPopulation() {
        return population;
    }

    public City setPopulation(Integer population) {
        this.population = population;
        return this;
    }
}
