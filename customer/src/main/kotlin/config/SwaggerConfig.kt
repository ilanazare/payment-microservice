package com.payment.config

import io.swagger.v3.oas.models.info.Info
import org.springdoc.core.GroupedOpenApi
import org.springdoc.core.customizers.OpenApiCustomiser
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@Configuration
class SwaggerConfig : WebMvcConfigurer {
    @Bean
    fun apiV1(): GroupedOpenApi =
        GroupedOpenApi.builder()
            .group("v1")
            .addOpenApiCustomiser { OpenApiCustomiser { it.info(Info().title("Microservice payment with pay pix").version("1"))} }
            .packagesToScan("com.tqi.challenge.pix.web.controller")
            .build()
}
