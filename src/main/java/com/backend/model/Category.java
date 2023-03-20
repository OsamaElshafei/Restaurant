package com.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Category extends categoryorder{

    @OneToMany
    @JsonIgnore
    private Set<Order>orders;


}
