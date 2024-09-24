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
public class PowerBank {
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

    private String inputPorts;
    private String capacity;
    private String numberOfOutputPorts;
    private String totalOutputPower;
    private String wirelessCharging;

    private boolean haveDes;
    private String description;
    private String descriptionImage;


    @OneToMany(mappedBy = "powerBankC" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("powerBankC")
    private Set<PowerBankColors> color;

    @OneToMany(mappedBy = "powerBank" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("powerBank")
    private Set<PowerBankImages> images;
}
