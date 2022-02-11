package com.training.paradise.dao.jdbc;

import com.training.paradise.model.Place;
import com.training.paradise.dao.PlaceDao;

import java.sql.Connection;

public class JdbcPlaceDao extends JdbcDao implements PlaceDao {

    public JdbcPlaceDao(Connection connection) {
        super(connection);
    }

    @Override
    public Long createPlace(Place place) {
        return null;
    }

    @Override
    public Place findPlaceById(Long id) {
        return null;
    }

    @Override
    public boolean updatePlace(Place place) {
        return false;
    }

    @Override
    public boolean removePlace(Place place) {
        return false;
    }

    @Override
    public Place findAllPlace() {
        return null;
    }
}
