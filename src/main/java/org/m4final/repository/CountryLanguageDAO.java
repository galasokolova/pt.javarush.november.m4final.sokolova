package org.m4final.repository;

import org.m4final.entity.CountryLanguage;

import java.util.List;

public class CountryLanguageDAO implements Repository<CountryLanguage> {
    @Override
    public List<CountryLanguage> getItems(int offset, int limit) {
        return null;
    }

    @Override
    public int getTotalCount() {
        return 0;
    }

    @Override
    public CountryLanguage getById(int id) {
        return null;
    }

    @Override
    public List<CountryLanguage> findAll() {
        return null;
    }

    @Override
    public CountryLanguage save(CountryLanguage entity) {
        return null;
    }

    @Override
    public CountryLanguage update(CountryLanguage entity) {
        return null;
    }

    @Override
    public void delete(CountryLanguage entity) {

    }

    @Override
    public void deleteById(int entityId) {

    }
}
