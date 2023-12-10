package com.mycompany.controller;

import com.mycompany.constans.RateConstans;
import com.mycompany.dto.RateDtoRes;
import com.mycompany.mapper.RateDomDtoMapper;
import com.mycompany.criteria.rate.RateCriteria;
import com.mycompany.usercases.RateServiceSearch;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

import static com.mycompany.constans.RateConstans.*;

@Tag(name = PRODUCT, description = DESC_PRODUCT)
@RestController
@Validated
@RequestMapping(RateConstans.API_PATH)
public class RateController {
    @Autowired
    RateServiceSearch serviceSearch;

    @Autowired
    RateDomDtoMapper rateDomDtoMapper;

    @Operation(summary = DESC_RATE_PRODUCT)
    @GetMapping(value = RateConstans.RATE_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RateDtoRes> rateProduct(
            @Parameter(name = APPLICATION_DATE, description = APPLICATION_DATE_DESC, example = APPLICATION_DATE_EXAMPLE, required = true)
                 @RequestParam(value = APPLICATION_DATE) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate,

            @Parameter(name = BRAND_ID, description = BRAND_ID_DESC, example = BRAND_ID_EXAMPLE, required = true)
                  @RequestParam(value = BRAND_ID) @Min(1) int brandId,

            @Parameter(name = PRODUCT_ID, description = PRODUCT_ID_DESC, example = PRODUCT_ID_EXAMPLE, required = true)
                 @PathVariable @Min(1) int productId)
    {
        return ResponseEntity.ok(rateDomDtoMapper.toDto(
                serviceSearch.getRateProduct(RateCriteria.builder().applicationDate(applicationDate).brandId(brandId).productId(productId).build()))
        );
    }
}
