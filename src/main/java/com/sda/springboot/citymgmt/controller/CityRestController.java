package com.sda.springboot.citymgmt.controller;

import com.sda.springboot.citymgmt.model.City;
import com.sda.springboot.citymgmt.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/api/city")

public class CityRestController {

    @Autowired
    private CityService cityService;

    //@RequestMapping("/city")
    @GetMapping
    // @ResponseBody
    public List<City> getCities() {
        return cityService.getCities();
    }

    //localhost:8080/city/name?name=London
    @GetMapping("/name")
    public List<City> getCitiesByName(@RequestParam("name")String name){
        return cityService.getCitiesByName(name);
    }

   //localhost:8080/city/name?name=London
    @GetMapping("/name/{cityName}")
    public List<City> getCitiesByName2(@PathVariable("cityName")String name){
        return cityService.getCitiesByName(name);
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable("id") Long id) {
        return cityService.getCityById(id);
    }

    //localhost:8080/city/countrycode/Est/name/Tallinn
    @GetMapping("/countrycode/{countryCode}/name/{name}")
    public List<City>getCitiesByCountryCode(@PathVariable("countryCode") String countryCode){
        return cityService.getCitiesByCountryCode(countryCode);
    }

    //localhost:8080/city/populationgt/5000
    @GetMapping("/populationgt/{population}")
    public List<City>getCitiesByPopulationGreaterThan(@PathVariable("population")Long population){
        return cityService.getCitiesByPopulationGreaterThan(population);
    }

    //localhost:8080/city/countrycodename/EST/TLN
    @GetMapping("/countrycodename/{countryCode}/{CityName}")
    public  List<City>getCitiesByCountryCodeAndCityName(@PathVariable("countryCode") String countryCode,
                                                        @PathVariable("CityName") String cityName){
        return cityService.getCitiesByCountryCodeAndCityName(countryCode ,cityName);
    }

    @GetMapping("/populationgtindistrict/{district}/{cityName}")
    public List<City>getCitiesInDistrictByPopulationGreaterThan(@PathVariable("district")String district,
                                                                @PathVariable("CityName")String cityName){
        return cityService.getCitiesInDistrictByPopulationGreaterThan(district, cityName);
    }

    @PostMapping
    public City saveCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }
//    @RequestMapping("/citypage")
//    public String goToSamplePage(){
//        return "sample";
//    }
}
