package com.mycompany.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

import static com.mycompany.constans.RateEntityConstans.*;

@Data
@Embeddable
public class RateEntityPk implements Serializable {

    @Column(name = BRAND_ID_CONSTANT)
    private int brandId;

    @Column(name = PRODUCT_ID_CONSTANT)
    private int productId;

    @Column(name = PRICE_LIST_CONSTANT)
    private int priceList;
}
