package com.mycompany.constans;

public class RateConstans {
    public static final String API_VERSION = "v1";
    public static final String API_PATH = "/api/"+API_VERSION;
    public static final String RATE_PATH = "{productId}/rate";
    public static final String DESC_RATE_PRODUCT = "returns the fee and value of the product.";
    public static final String DESC_PRODUCT = "Actions available for a product.";
    public static final String PRODUCT = "Product";

    public static final String APPLICATION_DATE = "applicationDate";
    public static final String APPLICATION_DATE_DESC = "Rate date";
    public static final String APPLICATION_DATE_EXAMPLE = "2020-06-14T10:29:36.447105571Z";

    public static final String BRAND_ID = "brandId";
    public static final String BRAND_ID_DESC = "Brand Id";
    public static final String BRAND_ID_EXAMPLE = "1";

    public static final String PRODUCT_ID = "productId";
    public static final String PRODUCT_ID_DESC = "Product Id";
    public static final String PRODUCT_ID_EXAMPLE = "35455";

    private RateConstans() {
    }
}

