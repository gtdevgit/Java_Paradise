package com.training.paradise.model;

import java.io.Serializable;

public class Trip implements Serializable {

    private long id;
    private String departure;
    private String destination;
    private Float price;

    public Trip(long id, String departure, String destination, Float price) {
        this.id = id;
        this.departure = departure;
        this.destination = destination;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
