package com.training.paradise.dao;

import com.training.paradise.dao.jdbc.JdbcPlaceDao;
import com.training.paradise.dao.jdbc.JdbcTripDao;
import com.training.paradise.util.ConnectionManager;

public class DaoFactory {
    private DaoFactory() {
    }

    public static JdbcTripDao getTripDao(){
        return new JdbcTripDao(ConnectionManager.getConnection());
    }

    public static JdbcPlaceDao getPlaceDao(){
        return new JdbcPlaceDao(ConnectionManager.getConnection());
    }
}
