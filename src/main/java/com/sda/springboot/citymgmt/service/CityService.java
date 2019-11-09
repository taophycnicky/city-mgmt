package com.sda.springboot.citymgmt.service;

import com.sda.springboot.citymgmt.model.City;
import com.sda.springboot.citymgmt.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getCities(){
        return cityRepository.findAll();
    }

    public List<City>getCitiesByName(String name){
        return cityRepository.findAllByName(name);
    }

    public City getCityById(Long id){
        return cityRepository.findById(id).orElse(null);
    }
    public City saveCity(City city){
        return cityRepository.save(city);
    }
    public List<City> getCitiesByCountryCode(String countryCode){
        return cityRepository.findAllByCountryCode(countryCode);
    }

    public List<City> getCitiesByPopulationGreaterThan(Long population){
        return cityRepository.findAllByPopulationIsGreaterThanEqual(population);
    }
    public List<City>getCitiesByCountryCodeAndCityName(String countryCode, String cityName){
        return cityRepository.findAllByCountryCodeAndName2( countryCode,  cityName);
    }

    public List<City> getCitiesInDistrictByPopulationGreaterThan(String district, String cityName){
        return cityRepository.findAllByDistrictAndPopulationGreaterThan(district, cityName);
    }
}
