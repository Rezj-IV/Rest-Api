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
public class HeadphoneAndHeadset {
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

    private String resistanceToWaterSoil;
    private String connectionType;
    private String bluetooth;
    private String anc;

    private String weight;
    private String mic;



    private boolean haveDes;
    private String description;
    private String descriptionImage;


    @OneToMany(mappedBy = "headphoneAndHeadsetC" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("headphoneAndHeadsetC")
    private Set<HeadphoneAndHeadsetColors> color;

    @OneToMany(mappedBy = "headphoneAndHeadset" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("headphoneAndHeadset")
    private Set<HeadphoneAndHeadsetImages> images;
}
