package com.excercise.productservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "vendor_sherwin")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vendorName;

    private String country;

    @OneToMany(mappedBy = "vendor")
    private List<Product> products;
}
