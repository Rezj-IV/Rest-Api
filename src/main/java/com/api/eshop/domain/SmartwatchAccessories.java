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
public class SmartwatchAccessories {
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

//    @OneToMany(mappedBy = "smartwatchAccessoriesC" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
//    @JsonManagedReference("smartwatchAccessoriesC")
//    private List<SmartwatchAccessoriesColors> color;

    @OneToMany(mappedBy = "smartwatchAccessories" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("smartwatchAccessories")
    private List<SmartwatchAccessoriesImages> images;
}
