package com.yakub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class , UserDetailsServiceAutoConfiguration.class, SecurityAutoConfiguration.class})
//@ComponentScan("com.jwt.repositories")
@ComponentScan(basePackages="com.nice.application")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
