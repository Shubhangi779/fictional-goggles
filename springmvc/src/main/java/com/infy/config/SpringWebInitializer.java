package com.infy.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext  applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(SpringWebConfiguration.class);
		applicationContext.setServletContext(servletContext);
		Dynamic servlet = servletContext.addServlet("spring", new DispatcherServlet(applicationContext));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(2);
		
	}

}
