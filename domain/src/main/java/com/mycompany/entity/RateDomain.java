package com.mycompany.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
@Data
public class RateDomain {

    private RateDomainPk rateDomainPk;

    private Date startDate;

    private Date endDate;

    private int priority;

    private float price;

    private String curr;

    private LocalDateTime applicationDate;

}
