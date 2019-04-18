package pl.geolocation.model;


import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class LocalizationsDaoImpl implements LocalizationsDao{


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List findAll() {

        Query showAllLocalizations = entityManager.createQuery("select u from Localizations u");


        return showAllLocalizations.getResultList();
    }

    @Override
    public Localizations findNearest(Double latitude, Double longtitude) {

        Query lat = entityManager.createQuery("select latitude, longtitude from Localizations ");

    return (Localizations) lat;

    }
}
