package com.training.paradise.dao.jdbc;

import com.training.paradise.model.Place;
import com.training.paradise.dao.PlaceDao;

import java.sql.*;

public class JdbcPlaceDao extends JdbcDao implements PlaceDao {

    public JdbcPlaceDao(Connection connection) {
        super(connection);
    }

    private final int COLUMN_ID = 1;

    @Override
    public Long createPlace(Place place) {
        int autoIncrKey = -1;
        String query = "INSERT INTO public.place(name) VALUES (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, place.getName());
            // Attention avec un preparedStatement il ne faut pas mettre de query dans le executeUpdate
            // sinon erreur "Impossible d''utiliser les fonctions de requête qui utilisent une chaîne de caractères sur un PreparedStatement."
            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()){
                autoIncrKey = rs.getInt(COLUMN_ID);
            } else {
                throw new SQLException();
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return (long) autoIncrKey;
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
