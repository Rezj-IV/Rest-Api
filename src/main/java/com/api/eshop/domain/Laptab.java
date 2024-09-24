package com.api.eshop.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mysql.cj.protocol.ColumnDefinition;
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
public class Laptab {
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

    private String ramMemoryCapacity;
    private String processorseries;
    private String displayDimensions;
    private String userType;
    private String internalMemoryCapacity;
    private String gpuManufacturer;

    private String battery;
    private String weight;
    private String imageResolution;

    private boolean haveDes;


    @Column(columnDefinition = "longtext")
    private String description;

    private String descriptionImage;




    @OneToMany(mappedBy = "laptab" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("laptab")
    private List<LaptabImages> images;

}
