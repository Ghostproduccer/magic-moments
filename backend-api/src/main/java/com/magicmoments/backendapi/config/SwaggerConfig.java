package com.magicmoments.backendapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title="Magic moments API",
                version = "1.0.0",
                description = "This is an API RESTful for magic moments"
        )
)
public class SwaggerConfig {
}
