package com.mycompany.mapper;

import com.mycompany.dto.RateDtoRes;
import com.mycompany.entity.RateDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface RateDomDtoMapper {

    RateDomDtoMapper mapper = Mappers.getMapper(RateDomDtoMapper.class);

    @Mapping(source = "rateDomainPk.brandId", target = "brandId")
    @Mapping(source = "rateDomainPk.productId", target = "productId")
    @Mapping(source = "rateDomainPk.priceList", target = "priceList")
    RateDtoRes toDto(RateDomain rateDomain);

}
