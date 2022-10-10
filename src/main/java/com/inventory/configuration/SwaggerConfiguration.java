package com.inventory.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.collect.Lists.newArrayList;

@Component
@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfiguration extends WebMvcConfigurerAdapter {

    private static final String API_TITLE = "Inventory-Management";

    private static final String API_DESCRIPTION = "Inventory-Management service with Spring Boot and Swagger";

    private static final String CONTROLLERS_BASE_PACKAGE = "com.inventory.controller";

    private static final String API_NAME = "x-auth-token";

    private static final String API_KEY_NAME = "x-auth-token";

    private static final String PASS_AS = "header";

    @Value("${swagger.api.version}")
    private String version;

    @Bean
    public Docket inventoryApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .securitySchemes(newArrayList(apiKey()))
                .securityContexts(newArrayList(securityContext()))
                .select()
                .apis(RequestHandlerSelectors.basePackage(CONTROLLERS_BASE_PACKAGE))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(API_TITLE)
                .description(API_DESCRIPTION)
                .version(version)
                .build();
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder().build();
    }

    private ApiKey apiKey() {
        return new ApiKey(API_NAME, API_KEY_NAME, PASS_AS);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}