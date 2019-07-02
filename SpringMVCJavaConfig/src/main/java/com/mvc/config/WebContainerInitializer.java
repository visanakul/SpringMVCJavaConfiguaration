package com.mvc.config;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebContainerInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	public WebContainerInitializer() {
		System.out.println("***WebContainerInitializer***");
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
		System.out.println("***onStartup***");
		
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootContainerConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebComponentContainerConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "*.htm" };
	}

}
