package pl.geolocation.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalizationServiceImpl implements LocationService{

   private LocalizationsDao localizationsDao;

   @Autowired
   private void local(LocalizationsDao localizationsDao){
       this.localizationsDao = localizationsDao;
   }


    @Override
    public List<Localizations> findAll() {
        return localizationsDao.findAll();
    }

    @Override
    public Localizations findNearest() {

      return localizationsDao.findNearest();
    }
}
