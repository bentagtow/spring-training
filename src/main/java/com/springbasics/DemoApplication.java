package com.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springbasics.demo.scope.PersonDAO;

@SpringBootApplication
public class DemoApplication {
	
	//things you need to tell Spring: 
	//1. What are the Beans?
	//2. What are the dependencies for a bean?
	//3. Where to search for beans?
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(DemoApplication.class); 

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = 
//				new BinarySearchImpl(new QuickSortAlgorithm());
//		
//		
//		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
//		
//		System.out.println(result);
		ApplicationContext applicationContext = 
				SpringApplication.run(DemoApplication.class, args);
		
		PersonDAO personDao = 
				applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDao2 = 
				applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());		
		LOGGER.info("{}", personDao.getJdbcConnection());	
		LOGGER.info("end of personDAO 1");


		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());

	}
}