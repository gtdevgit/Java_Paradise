package com.training.paradise.configuration;

public class ValueNotFoundException extends Exception{
    public ValueNotFoundException(String key) {
        super(String.format("No value found for key : %s", key));
    }
}
