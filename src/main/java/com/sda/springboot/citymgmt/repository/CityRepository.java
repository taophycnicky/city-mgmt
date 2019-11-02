package com.sda.springboot.citymgmt.repository;

import com.sda.springboot.citymgmt.model.City;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CityRepository extends JpaRepository< City, Long> {

}
