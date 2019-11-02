package com.sda.springboot.citymgmt.controller;

import com.sda.springboot.citymgmt.model.City;
import com.sda.springboot.citymgmt.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/city")

public class CityController {

    @Autowired
    private CityService cityService;

    //@RequestMapping("/city")
    @GetMapping
    // @ResponseBody
    public List<City> getCities() {
        return cityService.getCities();
    }

    @GetMapping("/name")
    public List<City> getCitiesByName(@RequestParam("name")String name){
        return cityService.getCities();
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable("id") Long id) {
        return cityService.getCityById(id);
    }

    @PostMapping("/add")
    public void addCity(City city) {

    }
//    @RequestMapping("/citypage")
//    public String goToSamplePage(){
//        return "sample";
//    }
}
