package com.infy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.infy.controller")
@EnableWebMvc
public class SpringWebConfiguration {
	@Bean
	public ViewResolver veiwResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("/pages/",".jsp");	
		return viewResolver;
		
	}

}
