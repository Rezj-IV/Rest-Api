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
public class Refrigerator {
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

    private String type ;
    private String numberOfShelveInRefrigerator;
    private String energyConsumptionChart;
    private String noThrush;

    private String waterCooler;
    private String iceMaker;



    ;

    @OneToMany(mappedBy = "refrigerator" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("refrigerator")
    private List<RefrigeratorImages> images;

}
