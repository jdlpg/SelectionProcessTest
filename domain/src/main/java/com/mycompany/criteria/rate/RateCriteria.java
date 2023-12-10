package com.mycompany.criteria.rate;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class RateCriteria {

    private LocalDateTime applicationDate;

    private int productId;

    private int brandId;

}
