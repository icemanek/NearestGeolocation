package pl.geolocation.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LocalizationsDao {

    List findAll();

// @Query("select u from Localizations u ORDER BY ((u.latitude-:dlugosc)*(u.latitude-:dlugosc))+ ((u.longtitude-:szerokosc)*(u.longtitude-:szerokosc)) ASC")
    Localizations findNearest(@Param("dlugosc") Double war1, @Param("szerokosc") Double war2);
}
