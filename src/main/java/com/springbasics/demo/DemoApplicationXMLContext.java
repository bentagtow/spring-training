package com.springbasics.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springbasics.demo.xml.XMLPersonDAO;

//@ComponentScan
public class DemoApplicationXMLContext {

	//things you need to tell Spring:
	//1. What are the Beans?
	//2. What are the dependencies for a bean?
	//3. Where to search for beans?

	private static Logger LOGGER = LoggerFactory.getLogger(DemoApplicationXMLContext.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
			// [xmlJdbcConnection, xmlPersonDAO]

			XMLPersonDAO personDAO = applicationContext.getBean(XMLPersonDAO.class);

			LOGGER.info("{} {}", personDAO, personDAO.getXmlJdbcConnection());
		}
	}
}