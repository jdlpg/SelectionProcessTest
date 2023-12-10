package com.mycompany.mapper;

import com.mycompany.dto.RateDtoRes;
import com.mycompany.entity.RateDomain;
import com.mycompany.entity.RateDomainPk;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class RateDomDtoMapperTest {

    @InjectMocks
    private RateDomDtoMapper mapper = Mappers.getMapper(RateDomDtoMapper.class);

    @Test
    void testToDto() {
        RateDomain rateDomain = new RateDomain();
        RateDomainPk rateDomainPk = new RateDomainPk();
        rateDomain.setRateDomainPk(rateDomainPk);
        rateDomain.getRateDomainPk().setBrandId(23);
        rateDomain.getRateDomainPk().setProductId(56);
        rateDomain.getRateDomainPk().setPriceList(789);

        RateDtoRes rateDtoRes = mapper.toDto(rateDomain);

        assertEquals( rateDomain.getRateDomainPk().getProductId(), rateDtoRes.getProductId());
        assertEquals( rateDomain.getRateDomainPk().getBrandId(), rateDtoRes.getBrandId());
        assertEquals( rateDomain.getRateDomainPk().getPriceList(), rateDtoRes.getPriceList());
        assertEquals( rateDomain.getPrice(), rateDtoRes.getPrice());
    }

}

