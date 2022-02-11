package com.training.paradise.dao;

import com.training.paradise.dao.jdbc.JdbcPlaceDao;
import com.training.paradise.dao.jdbc.JdbcTripDao;
import com.training.paradise.util.ConnectionManager;

public class DaoFactory {
    public DaoFactory() {
    }

    public JdbcTripDao getTripDao(){
        JdbcTripDao jdbcTripDao = new JdbcTripDao(ConnectionManager.getConnection());
        return jdbcTripDao;
    }

    public JdbcPlaceDao getPlaceDao(){
        JdbcPlaceDao jdbcPlaceDao = new JdbcPlaceDao(ConnectionManager.getConnection());
        return jdbcPlaceDao;
    }
}
