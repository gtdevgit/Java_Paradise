package com.training.paradise.dao.jdbc;

import com.training.paradise.dao.CrudGenericDao;
import com.training.paradise.model.Trip;
import com.training.paradise.dao.TripDao;

import java.sql.Connection;
import java.util.List;

public class JdbcTripDao extends JdbcDao implements CrudGenericDao<Long, Trip> {

    public JdbcTripDao(Connection connection) {
        super(connection);
    }

    @Override
    public Long create(Trip trip) {
        return null;
    }

    @Override
    public Trip findById(Long id) {
        return null;
    }

    @Override
    public boolean update(Trip trip) {
        return false;
    }

    @Override
    public boolean remove(Trip trip) {
        return false;
    }

    @Override
    public List<Trip> findAll() {
        return null;
    }
}
