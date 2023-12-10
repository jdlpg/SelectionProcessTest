package com.mycompany.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


import java.util.Date;

import static com.mycompany.constans.RateEntityConstans.*;

@Data
@Entity
@Table(name = TABLE_NAME_CONSTANS)
public class RateEntity {

    @EmbeddedId
    private RateEntityPk rateEntityPk;

    @Column(name = START_DATE_CONSTANT)
    private Date startDate;

    @Column(name = END_DATE_CONSTANT)
    private Date endDate;

    @Column(name = PRIORITY_CONSTANT)
    private int priority;

    @Column(name = PRICE_CONSTANT)
    private float price;

    @Column(name = CURR_CONSTANT)
    private String curr;
}
