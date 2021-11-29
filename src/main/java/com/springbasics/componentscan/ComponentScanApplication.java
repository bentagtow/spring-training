package com.springbasics.componentscan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springbasics.demo.scope.PersonDAO;

@SpringBootApplication
@ComponentScan
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
		ApplicationContext applicationContext = 
				SpringApplication.run(ComponentScanApplication
						.class, args);
		
		ComponentDAO componentDAO = 
				applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);

	}
}
