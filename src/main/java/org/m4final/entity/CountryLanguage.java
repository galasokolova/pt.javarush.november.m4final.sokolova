package org.m4final.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@Entity
@Table(schema = "world", name = "country_language")
public class CountryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "country_id")
    private Country country;

    private String language;

    @Column(name = "is_official", columnDefinition = "BIT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isOfficial;

    private BigDecimal percentage;

    public Integer getId() {
        return id;
    }

    public CountryLanguage setId(Integer id) {
        this.id = id;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public CountryLanguage setCountry(Country country) {
        this.country = country;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public CountryLanguage setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Boolean getOfficial() {
        return isOfficial;
    }

    public CountryLanguage setOfficial(Boolean official) {
        isOfficial = official;
        return this;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public CountryLanguage setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
        return this;
    }
}
