package com.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.mvc.service" })
public class RootContainerConfig {
	public RootContainerConfig() {
		System.out.println("***RootContainerConfig***");
	}
}
