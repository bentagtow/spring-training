package com.springbasics.demo;

import com.springbasics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springbasics.componentscan")
public class ComponentScanApplication {
	
	//things you need to tell Spring: 
	//1. What are the Beans?
	//2. What are the dependencies for a bean?
	//3. Where to search for beans?
	
	private static Logger LOGGER =
			LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch =
//				new BinarySearchImpl(new QuickSortAlgorithm());
//
//
//		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
//
//		System.out.println(result);

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ComponentScanApplication.class
		)) {
					ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
			LOGGER.info("{}", componentDAO);
		}
	}
}
