package org.m4final.redis;

import java.math.BigDecimal;

public class Language {
    private String language;
    private Boolean isOfficial;
    private BigDecimal percentage;

    public String getLanguage() {
        return language;
    }

    public Language setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Boolean getOfficial() {
        return isOfficial;
    }

    public Language setOfficial(Boolean official) {
        isOfficial = official;
        return this;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public Language setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
        return this;
    }
}
