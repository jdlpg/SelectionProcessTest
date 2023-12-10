package com.mycompany;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.mycompany.constans.ProductAppConstans.*;

@SpringBootApplication
public class ProductApp {
    public static void main(String[] args) {
        SpringApplication.run(ProductApp.class, args);
    }

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI().info(
                new Info()
                        .title(APP_TITLE)
                        .version(APP_VERSION)
                        .description(APP_DESC)
                        .license(new License().name(APACHE_2).url(APACHE_2_URL)));
    }
}
