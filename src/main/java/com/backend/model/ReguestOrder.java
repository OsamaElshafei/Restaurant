package com.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReguestOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String code;
    @Lob
    private String note;
    private int totalPrice;
    private int totalQuantity;
    @CreationTimestamp
    private Date dataCreated;
    @UpdateTimestamp
    private Date dataUpdated;
@OneToMany(cascade = CascadeType.ALL,mappedBy = "reguestOrder")
private Set<item>items;
@ManyToOne
@JoinColumn(name = "Client_id")
private Client client;
@OneToOne
@JoinColumn(name = "adress_id")
private Adress adress;


}
