package ru.novikov.AppSensorAndWeatherSpringBootWithRestAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.novikov.AppSensorAndWeatherSpringBootWithRestAPI.models.Measurement;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
