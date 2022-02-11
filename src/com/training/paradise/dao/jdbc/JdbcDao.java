package com.training.paradise.dao.jdbc;

import com.training.paradise.util.ConnectionManager;
import jdk.jshell.execution.Util;

import java.sql.Connection;

public abstract class JdbcDao {
    protected Connection connection;

    public JdbcDao(Connection connection) {
        this.connection = ConnectionManager.getConnection();
    }
}
