package com.api.eshop.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MobileAccessoriesColors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Color;


    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "MobileAccessoriesColor_fk_1"))
    @JsonBackReference("mobileAccessoriesC")
    private MobileAccessories  mobileAccessoriesC ;
}
