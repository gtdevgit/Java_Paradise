package com.training.paradise.dao;

import com.training.paradise.model.Place;

public interface PlaceDao {
    Long createPlace(Place place);
    Place findPlaceById(Long id);
    boolean updatePlace(Place place);
    boolean removePlace(Place place);
    Place findAllPlace();
}
