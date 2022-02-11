package com.training.paradise.dao.jdbc;

import com.training.paradise.model.Trip;
import com.training.paradise.dao.TripDao;

import java.sql.Connection;

public class JdbcTripDao extends JdbcDao implements TripDao {

    public JdbcTripDao(Connection connection) {
        super(connection);
    }

    @Override
    public Long createPlace(Trip trip) {
        return null;
    }

    @Override
    public Trip findPlaceById(Long id) {
        return null;
    }

    @Override
    public boolean updatePlace(Trip trip) {
        return false;
    }

    @Override
    public boolean removePlace(Trip trip) {
        return false;
    }

    @Override
    public Trip findAllPlace() {
        return null;
    }
}
