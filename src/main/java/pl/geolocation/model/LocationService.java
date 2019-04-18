package pl.geolocation.model;

import org.springframework.stereotype.Service;
import pl.geolocation.model.Localizations;

import java.util.List;

@Service
public interface LocationService {

    List<Localizations> findAll();

    Localizations findNearest();
}
