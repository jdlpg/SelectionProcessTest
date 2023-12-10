package com.mycompany.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonRootName(value = "RateResponse")
public class RateDtoRes {

    int productId;

    int brandId;

    String priceList;

    private LocalDateTime applicationDate;

    float price;

}
