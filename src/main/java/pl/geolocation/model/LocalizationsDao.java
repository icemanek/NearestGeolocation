package pl.geolocation.model;

import java.util.List;

public interface LocalizationsDao {

    List findAll();

    Localizations findNearest();
}
