package pl.geolocation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.geolocation.model.Localizations;


import java.util.List;

@Service
public class LocalizationServiceImpl implements LocalizationsService {

    private LocalizationsRepository localizationsRepository;

    @Autowired
    private void local(LocalizationsRepository localizationsRepository) {
        this.localizationsRepository = localizationsRepository;
    }


    @Override
    public List<Localizations> findAll() {

        return localizationsRepository.findAll();
    }

//    @Override
//    public Localizations findNearest(Double latitude, Double longtitude) {
//
//        return localizationsRepository.findNearest(latitude, longtitude);
//    }
}
