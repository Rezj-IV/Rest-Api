package com.api.eshop.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Monitor {
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
    private String color;

    private boolean gaming;

    private String screenType;
    private String screensSize;
    private String screenResolution;
    private String userType;

    private String panelType;
    private String lightIntensity;
    private String backlight;



    private boolean haveDes;
    private String description;
    private String descriptionImage;


    @OneToMany(mappedBy = "monitor" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("monitor")
    private List<MonitorImages> images;
}
