package pl.geolocation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.geolocation.model.Localizations;

import java.util.List;

@Service
public class LocalizationServiceImpl implements LocalizationsService {

    private LocalizationsService localizationsService;

    @Autowired
    private void local(LocalizationsService localizationsService) {
        this.localizationsService = localizationsService;
    }


    @Override
    public List<Localizations> findAll() {
        return localizationsService.findAll();
    }

    @Override
    public Localizations findNearest(Double latitude, Double longtitude) {

        return localizationsService.findNearest(latitude, longtitude);
    }
}
