package com.mycompany.repository;

import com.mycompany.entity.RateDomain;
import com.mycompany.criteria.rate.RateCriteria;

import java.util.List;

public interface RateRepository {
    List<RateDomain> getProductRate(RateCriteria rateCriteria);
}
