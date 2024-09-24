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
public class Tv {
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



    private String screenSize;
    private String pageTechnology;
    private String imageQuality;

    private String userType;
    private String panelType;
    private String resolution;
    private String screenType;



    @OneToMany(mappedBy = "tv" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("tv")
    private List<TvImages> images;

}
