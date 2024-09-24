package com.api.eshop.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int priceWithDiscount ;
    private int price;
    private int stock ;
    private boolean incredibleOffers;
    private int userCommentNumber ;
    private String name;
    private String nameB;
    private String indexImageUrl;
    private String category;

    private String userType;

    private String cpu;
    private String memory;
    private String ram;
    private String screenSize;
    private String rearCamera;
    private String batteryCapacity;
    private String simCardNumber;
    private String operatingSystem;
    private String resolution;
    private String internetNetWork;
    private String weightGirth;
    private String pexelDensity;

    private boolean haveDes;
    private String description;
    private String descriptionImage;





    @OneToMany(mappedBy = "mobileC" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("mobileC")
    private Set<MobileColors> color;


    @OneToMany(mappedBy = "mobile" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("mobile")
    private Set<MobileImages> images;


}
