package org.m4final.repository;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.m4final.entity.City;

import java.util.List;

public class CityDAO implements Repository<City> {
    private final SessionFactory sessionFactory;

    public CityDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List getItems(int offset, int limit) {
        Query<City> query = sessionFactory.getCurrentSession().createQuery("select c from City c", City.class);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.list();
    }

    @Override
    public City getById(int id) {
        Query<City> query = sessionFactory.getCurrentSession().createQuery("select c from City c join fetch c.country where c.id = :ID", City.class);
        query.setParameter("ID", id);
        return query.getSingleResult();
    }

    @Override
    public int getTotalCount() {
        Query<Long> query = sessionFactory.getCurrentSession().createQuery("select count(c) from Country c", Long.class);
        return Math.toIntExact(query.uniqueResult());
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public City save(City entity) {
        return null;
    }

    @Override
    public City update(City entity) {
        return null;
    }

    @Override
    public void delete(City entity) {
    }

    @Override
    public void deleteById(int entityId) {
    }

}