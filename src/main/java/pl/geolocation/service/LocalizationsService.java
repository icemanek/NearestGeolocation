package pl.geolocation.service;


import pl.geolocation.model.Localizations;

import java.util.List;

public interface LocalizationsService {

    List findAll();


    Localizations findNearest(Double latitude, Double longtitude);
}
