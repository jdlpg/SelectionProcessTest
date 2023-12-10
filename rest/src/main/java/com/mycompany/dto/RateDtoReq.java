package com.mycompany.dto;

import lombok.Data;

import java.util.Date;

@Data
public class RateDtoReq {

    private Date applicationDate;

    private int productId;

    private int chainId;
}
