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
public class AllinOne {
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

    private String displayDimension;
    private String processorSeries;
    private String ramMemoryCapacity;
    private String internalMemoryCapacity;
    private String userType;
    private String gpuModel;

    private String weight;
    private String imageResolution;

    private boolean haveDes;
    private String description;
    private String descriptionImage;



    @OneToMany(mappedBy = "allinOne" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("allinOne")
    private List<AllinOneImages> images;





}
