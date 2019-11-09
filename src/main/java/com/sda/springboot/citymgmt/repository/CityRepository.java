package com.sda.springboot.citymgmt.repository;

import com.sda.springboot.citymgmt.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findAllByName(String name);

    List<City> findAllByCountryCode(String countryCode);

    List<City> findAllByPopulationIsGreaterThanEqual(Long population);

    //List<City> findAllByCountryCodeAndName(String countryCode, String name);

    @Query("SELECT c FROM City c WHERE c.country.code = :cCode AND c.name = :cityName")
    List<City> findAllByCountryCodeAndName2(@Param("cCode") String countryCode,
                                            @Param("cityName") String name);

    @Query("SELECT c FROM City c WHERE c.country.code = :cCode AND c.name = :cityName")
    List<City> findAllByDistrictAndPopulationGreaterThan(@Param("cCode") String countryCode,
                                                          @Param("cityName") String name);


}
