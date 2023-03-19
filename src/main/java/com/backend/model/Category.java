package com.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Category extends categoryorder{

    @OneToMany
    private Set<Order>orders;


}
