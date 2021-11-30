package com.springbasics.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springbasics.demo.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class DemoPropertiesApplication {

	//things you need to tell Spring:
	//1. What are the Beans?
	//2. What are the dependencies for a bean?
	//3. Where to search for beans?

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(DemoPropertiesApplication.class)) {

			SomeExternalService service =
					applicationContext.getBean(SomeExternalService.class);


			System.out.println(service.returnServiceURL());
			//		applicationContext.close();
		}
	}
}