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
public class MobileAccessories {
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

    @OneToMany(mappedBy = "mobileAccessoriesC" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("mobileAccessoriesC")
    private Set<MobileAccessoriesColors> color;

    @OneToMany(mappedBy = "mobileAccessories" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("mobileAccessories")
    private Set<MobileAccessoriesImages> images;
}
