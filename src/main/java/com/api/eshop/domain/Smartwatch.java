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
public class Smartwatch {
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


    private String compatibility ;
    private String batteryCapacity;
    private String abilityTalk;
    private String persianLanguageSupport;

    private String mic;
    private String watchStyle;
    private String bodyMaterial ;

    private boolean haveDes;
    private String description;
    private String descriptionImage;

    @OneToMany(mappedBy = "smartwatchC" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("smartwatchC")
    private Set<SmartwatchColors> color;

    @OneToMany(mappedBy = "smartwatch" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("smartwatch")
    private Set<SmartwatchImages> images;
}
