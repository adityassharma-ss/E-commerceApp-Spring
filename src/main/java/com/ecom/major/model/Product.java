package com.ecom.major.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Model {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;
    private double price;
    private double weight;
    private String descrption;
    private String imageName;
}
