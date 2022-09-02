package com.api.sportyShoes.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = "com.api.sportyShoes")
@EnableWebMvc
public class SwaggerConfig {

	@Bean
	public Docket superHeroApiDoc() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.api.sportyShoes")).build()
		 .select()
         .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
         .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.cloud")))
         .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.data.rest.webmvc")))
         .paths(PathSelectors.any())
         .build();
		
	}
}
