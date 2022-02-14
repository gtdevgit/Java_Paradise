package com.training.paradise.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplicationConfig {
    private static final String APPLICATION_CONFIG_FILE = "application.config";

    private static final String DATABASE_FORNAME_KEY = "FORNAME";
    private static final String DATABASE_URL_KEY = "URL";
    private static final String DATABASE_USER_KEY = "USER";
    private static final String DATABASE_PASSWORD_KEY = "PASSWORD";

    // JDBC lib
    private String forName;
    // Database url
    private String url;
    // Database user
    private String user;
    // Database password
    private String password;

    private boolean findKey(Properties properties, String key) throws KeyNotFoundException {
        if (!properties.containsKey(key)){
            throw new KeyNotFoundException(key);
        }
        return true;
    }

    private String readKey(Properties properties, String key) throws ValueNotFoundException {
        try {
            if (findKey(properties, key)) {
                String value = properties.getProperty(key, "").trim();
                if (value == null || value.isEmpty()) {
                    throw new ValueNotFoundException(key);
                }
                return value;
            }
        } catch (KeyNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void load() throws FileNotFoundException, KeyNotFoundException, ValueNotFoundException {
        File file = new File(APPLICATION_CONFIG_FILE);

        if (!file.exists()){
            throw new FileNotFoundException(file.getAbsolutePath());
        }

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(APPLICATION_CONFIG_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }

        forName = readKey(properties, DATABASE_FORNAME_KEY);
        url = readKey(properties,DATABASE_URL_KEY);
        user = readKey(properties, DATABASE_USER_KEY);
        password = readKey(properties, DATABASE_PASSWORD_KEY);
    }

    public String getForName() {
        return forName;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

}
