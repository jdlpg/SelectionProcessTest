package com.mycompany.mapper;

import com.mycompany.entity.RateDomain;
import com.mycompany.entity.RateEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface RateEntDomMapper {

    RateEntDomMapper mapper = Mappers.getMapper(RateEntDomMapper.class);

    @Mapping(target = "applicationDate", ignore = true)
    @Mapping(source = "rateEntityPk", target = "rateDomainPk")
    RateDomain toDomain(RateEntity rateEntity);

    @Mapping(source = "rateDomainPk", target = "rateEntityPk")
    RateEntity toEntity(RateDomain rateDomain);

    default List<RateDomain> toDomainList(List<RateEntity> rateEntityList) {
        return (rateEntityList == null) ? new ArrayList<>() : rateEntityList.stream().map(this::toDomain).toList();
    }

}
