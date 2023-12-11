package com.example.hexagonaltest.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    info = @Info(
            title = "API 명세서",
            description = "게시판 API 명세서입니다.",
            version = "v1.0.2"
    )
)
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi openApi() {

        String[] paths = {"open/api", "/carts/**", "/boards/**"};

        return GroupedOpenApi.builder()
                .group("게시판서비스 API v1")
                .pathsToMatch(paths)
                .build();
    }



}
