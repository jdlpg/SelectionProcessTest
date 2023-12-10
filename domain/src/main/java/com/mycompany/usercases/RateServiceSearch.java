package com.mycompany.usercases;

import com.mycompany.entity.RateDomain;
import com.mycompany.criteria.rate.RateCriteria;

public interface RateServiceSearch {
    RateDomain getRateProduct(RateCriteria rateCriteria);
}
