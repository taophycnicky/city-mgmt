package com.sda.springboot.citymgmt.config;

import com.sda.springboot.citymgmt.repository.CityRepository;
import com.sda.springboot.citymgmt.service.CityService;
import com.sda.springboot.citymgmt.service.CountryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppBeanConfig {

    @Bean
    public CityService getCityService(){
        return new CityService();
    }

    @Bean
    public CountryService getCountryService(){
        return new CountryService();
    }
}
