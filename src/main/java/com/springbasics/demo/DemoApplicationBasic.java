package com.springbasics.demo;

import com.springbasics.demo.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DemoApplicationBasic {
	
	//things you need to tell Spring: 
	//1. What are the Beans?
	//2. What are the dependencies for a bean?
	//3. Where to search for beans?

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(DemoApplicationBasic.class)) {

			BinarySearchImpl binarySearch =
					applicationContext.getBean(BinarySearchImpl.class);

			BinarySearchImpl binarySearch1 =
					applicationContext.getBean(BinarySearchImpl.class);

			System.out.println(binarySearch);
			System.out.println(binarySearch1);

			int result =
					binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
			System.out.println(result);
//		applicationContext.close();
		}
	}
}