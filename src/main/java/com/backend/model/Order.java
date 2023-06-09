package com.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orderFood")
public class Order extends categoryorder{

    private int price;
    private String img;
    @Lob
    private String description;
    @ManyToOne
    @JoinColumn(name = "id_category")
    @JsonIgnore
    private Category category;

}
