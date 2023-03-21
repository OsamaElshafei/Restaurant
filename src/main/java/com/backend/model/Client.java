package com.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String fullName;
    private String email;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "client")
    private Set<ReguestOrder>reguestOrders;
}
