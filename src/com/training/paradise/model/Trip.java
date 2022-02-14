package com.training.paradise.model;

import java.io.Serializable;

public class Trip implements Serializable {

    private long id;
    private int departure;
    private int destination;
    private Float price;

    public Trip( int departure, int destination, Float price) {
        this.id = id;
        this.departure = departure;
        this.destination = destination;
        this.price = price;
    }

    public Trip(long id, int departure, int destination, Float price) {
        this.id = id;
        this.departure = departure;
        this.destination = destination;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public int getDeparture() {
        return departure;
    }

    public void setDeparture(int departure) {
        this.departure = departure;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
