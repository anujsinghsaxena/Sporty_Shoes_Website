package com.api.sportyShoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableAutoConfiguration(
exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = "sportyShoes")
public class SportyShoes {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoes.class, args);

	}

}
