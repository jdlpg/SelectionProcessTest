package com.mycompany.usercases;

import com.mycompany.entity.RateDomain;
import com.mycompany.criteria.rate.RateCriteria;
import com.mycompany.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateServiceSearchImpl implements RateServiceSearch{

    @Autowired
    private RateRepository rateRepository;

    @Override
    public RateDomain getRateProduct(RateCriteria rateCriteria) {
        RateDomain rateDomain = null;
        if (!rateRepository.getProductRate(rateCriteria).isEmpty()) {
            rateDomain = rateRepository.getProductRate(rateCriteria).get(0);
            rateDomain.setApplicationDate(rateCriteria.getApplicationDate()); //Request date is added to display it in the response.
        }
        return rateDomain;
    }
}
