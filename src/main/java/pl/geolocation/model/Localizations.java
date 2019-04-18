package pl.geolocation.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Component
public class Localizations {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String nazwa;

    @NotNull(message = "Nie może być puste!")
    private double latitude;

    @NotNull(message = "Nie może być puste!")
    private double longtitude;


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public Localizations(String nazwa, double latitude, double longtitude) {
        this.nazwa = nazwa;
        this.latitude = latitude;
        this.longtitude = longtitude;
    }


    public Localizations() {
    }
}
