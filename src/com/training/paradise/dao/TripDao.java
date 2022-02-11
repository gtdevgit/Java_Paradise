package com.training.paradise.dao;

import com.training.paradise.model.Trip;

public interface TripDao {
    Long createPlace(Trip trip);
    Trip findPlaceById(Long id);
    boolean updatePlace(Trip trip);
    boolean removePlace(Trip trip);
    Trip findAllPlace();
}
