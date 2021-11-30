package com.springbasics.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springbasics.demo.cdi.SomeCdiBusiness;

//@SpringBootApplication
public class DemoCdiApplication {

	//things you need to tell Spring:
	//1. What are the Beans?
	//2. What are the dependencies for a bean?
	//3. Where to search for beans?

	private static Logger LOGGER =
			LoggerFactory.getLogger(DemoCdiApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(DemoCdiApplication.class)) {

			SomeCdiBusiness business =
					applicationContext.getBean(SomeCdiBusiness.class);

			LOGGER.info("{} dau-{}", business, business.getSomeCDIDAO());
		}

	}
}