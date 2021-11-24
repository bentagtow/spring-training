package com.springbasics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class DemoApplication {
	
	//things you need to tell Spring: 
	//1. What are the Beans?
	//2. What are the dependencies for a bean?
	//3. Where to search for beans?

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
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch1 = 
				applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = 
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}
}