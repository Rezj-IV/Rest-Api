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
public class FooterInformatin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;

    @OneToMany(mappedBy = "footerInformatin" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JsonManagedReference("footerInformatin")
    private List<FooterInformatinSubset> subsets;
}
