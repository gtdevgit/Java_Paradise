package com.training.paradise.dao.jdbc;

import com.training.paradise.model.Place;
import com.training.paradise.dao.PlaceDao;

import java.sql.*;

public class JdbcPlaceDao extends JdbcDao implements PlaceDao {

    public JdbcPlaceDao(Connection connection) {
        super(connection);
    }

    @Override
    public Long createPlace(Place place) {
        int row = -1;
        String query = "INSERT INTO public.place(name) VALUES (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, place.getName());
            row = preparedStatement.executeUpdate();
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return (long) row;
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
