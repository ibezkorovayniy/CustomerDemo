package com.Illia.customerdemo.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
public class Customer extends BaseEntity {

    @Column(name= "fisrt_name")
    private String firstName;

    @Column(name= "last_name")
    private String lastName;

    @Column(name= "address")
    private String address;

    @Column(name = "budget")
    private BigDecimal budget;
}
