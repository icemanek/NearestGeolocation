package pl.geolocation.service;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.geolocation.model.Localizations;

import java.util.List;

public interface LocalizationsService {

    List<Localizations> findAll();

    @Query("select"
            + " asin(sqrt((sin(radians((:lat - latitude) / 2))) + cos(radians(:lat)) * cos(radians(latitude)) * (sin(radians((:lon - longtitude) / 2))))) as distance from Localizations")
    Localizations findNearest(@Param("lat") Double latitude, @Param("lon") Double longtitude);


}
