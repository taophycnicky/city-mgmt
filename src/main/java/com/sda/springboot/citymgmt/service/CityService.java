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
    public City getCityById(Long id){
        return cityRepository.findById(id).orElse(null);
    }
}
