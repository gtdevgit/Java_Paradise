package com.training.paradise.configuration;

public class KeyNotFoundException extends Exception{
    public KeyNotFoundException(String key) {
        super(String.format("Key not found : %s", key));
    }
}
