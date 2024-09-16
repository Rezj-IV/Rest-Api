package com.api.eshop.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int priceWithDicont ;
    private int price;
    private int stock ;
    private boolean incredibleOffers;
    private int userCommentNumber ;
    private String name;
    private String nameB;
    private String indexImageUrl;
    private String category;

//    @OneToMany(mappedBy = "mobileC" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
//    @JsonManagedReference("mobileC")
//    private List<MobileColors> color;


    @OneToMany(mappedBy = "mobile" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("mobile")
    private List<MobileImages> images;


}
