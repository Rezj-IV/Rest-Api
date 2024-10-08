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
public class PowerBankColors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Color;


    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "PowerBankColor_fk_1"))
    @JsonBackReference("powerBankC")
    private PowerBank  powerBankC ;
}
