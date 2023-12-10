package com.mycompany.dto;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class RateDtoResTest {

    @Test
    void testGetterSetter() {
        RateDtoRes rateDtoRes = new RateDtoRes();

        rateDtoRes.setProductId(123);
        rateDtoRes.setBrandId(456);
        rateDtoRes.setPriceList(789);
        rateDtoRes.setApplicationDate(LocalDateTime.now());
        rateDtoRes.setPrice(99.99f);

        assertThat(rateDtoRes.getProductId()).isEqualTo(123);
        assertThat(rateDtoRes.getBrandId()).isEqualTo(456);
        assertThat(rateDtoRes.getPriceList()).isEqualTo(789);
        assertThat(rateDtoRes.getApplicationDate()).isNotNull();
        assertThat(rateDtoRes.getPrice()).isEqualTo(99.99f);
    }

}