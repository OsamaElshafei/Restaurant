package com.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class categoryorder extends BaseEntity{
    private String name;
    @CreationTimestamp
    private Date CreateDate;
    @UpdateTimestamp
    private Date UpdateDate;



}
