package pl.geolocation.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Component;


@Component
public class DataSource extends BasicDataSource {
    public DataSource() {

        setDriverClassName("com.mysql.cj.jdbc.Driver");
        setUrl("jdbc:mysql://localhost:3306/geolocations?serverTimezone=UTC");
        setUsername("root");
        setPassword("coderslab");
    }
}
