package com.swagger.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Amar")
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(regex("/book.*")).build();
	}

	private ApiInfo apiInfo() {
		// TODO Auto-generated method stub
		return new ApiInfoBuilder().title("Book Service")
				.description("Sample Documention genrate using Swagger2 of Book Service Rest API")
				.build();
	}
}
