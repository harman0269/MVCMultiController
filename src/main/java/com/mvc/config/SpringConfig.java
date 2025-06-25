package com.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mvc")
public class SpringConfig implements WebMvcConfigurer{
	
	@Bean
	
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		
		
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/JSP/");
		viewResolver.setSuffix(".jsp");
//		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
		
	}
	
	//FOR JOINING RESOURCE EXTERNAL FILES LIKE CSS OR IMAGES IN JSP
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/resources/**")  // ** to match all files/folders inside resources
	            .addResourceLocations("/resources/"); // classpath-relative or webapp-relative path
	    System.out.println("SpringConfig.addResourceHandlers()");
	}

}
