package com.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.mvc.controller" })
public class WebComponentContainerConfig {
	public WebComponentContainerConfig() {
		System.out.println("***WebComponentConfig***");
	}

	@Bean
	public ViewResolver getViewResolver() {
		System.out.println("***ViewResolver***");
		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	}
}
