package com.api.eshop.domain;

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
public class Tablet {
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

    private String CPU;
    private String cameraQuality;
    private String screenSize;
    private String internalMemory;
    private String ramMemory;
    private String batteryCapacity;

    private String GPU;
    private String resolutionColors;


    private boolean haveDes;
    private String description;
    private String descriptionImage;



    @OneToMany(mappedBy = "tabletC" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("tabletC")
    private Set<TabletColors> color;

    @OneToMany(mappedBy = "tablet" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("tablet")
    private Set<TabletImages> images;

}
