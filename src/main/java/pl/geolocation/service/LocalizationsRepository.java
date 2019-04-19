package pl.geolocation.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.geolocation.model.Localizations;

import java.util.List;

public interface LocalizationsRepository extends JpaRepository<Localizations,Long> {

    List<Localizations> findAll();

//    Localizations findNearest(Double latitude, Double longtitude);

}
