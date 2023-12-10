package com.mycompany.repository;

import com.mycompany.entity.RateDomain;
import com.mycompany.entity.RateEntity;
import com.mycompany.mapper.RateEntDomMapper;
import com.mycompany.criteria.rate.RateCriteria;
import com.mycompany.specification.RateSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.mycompany.constans.RateRepositoyImplConstans.SORT_FIELD;

@Service
public class RateRepositoyImpl implements RateRepository {

    @Autowired
    RateJpaRepository repository;
    @Autowired
    RateEntDomMapper rateEntDomMapper;

    @Override
    public List<RateDomain> getProductRate(RateCriteria rateCriteria) {
        Specification<RateEntity> spec = RateSpecification.conFiltros(rateCriteria);
        Sort sort = Sort.by(Sort.Order.desc(SORT_FIELD));
        return rateEntDomMapper.toDomainList(repository.findAll(spec, sort));
    }
}
