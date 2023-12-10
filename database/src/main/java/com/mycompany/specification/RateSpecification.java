package com.mycompany.specification;

import com.mycompany.entity.RateEntity;
import com.mycompany.criteria.rate.RateCriteria;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RateSpecification {
    public Specification<RateEntity> conFiltros(RateCriteria rateCriteria) {
        Specification<RateEntity> spec = Specification.where(null);

        if (rateCriteria != null && rateCriteria.getBrandId() > 0) {
            spec = spec.and(brandId(rateCriteria.getBrandId()));
        }

        if (rateCriteria != null && rateCriteria.getProductId() > 0) {
            spec = spec.and(productId(rateCriteria.getProductId()));
        }
        if (rateCriteria != null) {
            spec = spec.and(applicationDateBetween(rateCriteria.getApplicationDate()));
        }
        return spec;
    }

    public Specification<RateEntity> brandId(int brandId) {

        return (root, query, criteriaBuilder) -> criteriaBuilder.and(criteriaBuilder.equal(root.get("rateEntityPk").get("brandId"), brandId));
    }

    public Specification<RateEntity> productId(int productId) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.and(criteriaBuilder.equal(root.get("rateEntityPk").get("productId"), productId));
    }

    public Specification<RateEntity> applicationDateBetween(LocalDateTime applicationDate) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.and(criteriaBuilder.lessThanOrEqualTo(root.get("startDate"), applicationDate), criteriaBuilder.greaterThan(root.get("endDate"), applicationDate));
    }
    private RateSpecification(){}
}
