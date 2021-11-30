package com.springbasics.demo.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


import com.springbasics.demo.DemoApplicationBasic;

//Load the context 
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchXMLConfigurationTest {

	//get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	public void testBasicScenario() {
		int result = binarySearch.binarySearch(new int[] {}, 5);
		//call method on binarySearch
		//check if the value is correct
		
		assertEquals(3, result);
	}

}
