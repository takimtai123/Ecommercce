package com.techstore.ecommercce.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.vladmihalcea.hibernate.type.array.ListArrayType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "product_details")
@TypeDef(name ="list-array", typeClass = ListArrayType.class) //định nghĩa kiểu dữ liệu
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private int inStock; //Số lượng

    private BigDecimal price;

    private BigDecimal discount;

    @Column(columnDefinition ="varchar(20)")
    private String size;

    @Column(columnDefinition ="varchar(20)")
    private String memory;

    @Column(columnDefinition ="varchar(20)")
    private String ram;

    @Column(columnDefinition ="varchar(30)")
    private String color;

    @Column(columnDefinition ="jsonb")
    private String description; // TODO: Xử lý dữ liệu

    @Type(type = "list-array")
    @Column(columnDefinition = "text[]") //list text
    private List<String> images;


}
