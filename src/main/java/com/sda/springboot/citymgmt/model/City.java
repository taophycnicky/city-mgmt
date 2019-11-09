package com.sda.springboot.citymgmt.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
//    @Column(name = "countrycode")  //used when the name on the database is case sensitive
//    private String countryCode;
    private String district;
    private Long population;

    @ManyToOne
    @JoinColumn(name = "countryCode")
    private Country country;
}
