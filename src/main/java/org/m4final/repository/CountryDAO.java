package org.m4final.repository;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.m4final.entity.Country;

import java.util.List;

public class CountryDAO implements Repository<Country> {
    private final SessionFactory sessionFactory;

    public CountryDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Country> findAll() {
        Query<Country> query = sessionFactory.getCurrentSession().createQuery("select c from Country c join fetch c.languages", Country.class);
        return query.list();
    }


    @Override
    public List<Country> getItems(int offset, int limit) {
        return null;
    }

    @Override
    public int getTotalCount() {
        return 0;
    }

    @Override
    public Country getById(int id) {
        return null;
    }


    @Override
    public Country save(Country entity) {
        return null;
    }

    @Override
    public Country update(Country entity) {
        return null;
    }

    @Override
    public void delete(Country entity) {
    }

    @Override
    public void deleteById(int entityId) {
    }

}